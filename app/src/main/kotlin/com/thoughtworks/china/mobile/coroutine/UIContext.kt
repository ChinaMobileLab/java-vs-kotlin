package com.thoughtworks.china.mobile.coroutine

import android.os.Handler
import android.os.Looper
import kotlinx.coroutines.experimental.CoroutineScope
import kotlinx.coroutines.experimental.launch
import kotlin.coroutines.experimental.AbstractCoroutineContextElement
import kotlin.coroutines.experimental.Continuation
import kotlin.coroutines.experimental.ContinuationInterceptor

object UIContext : HandlerContext(Looper.getMainLooper()) {
    operator fun invoke(block: suspend CoroutineScope.() -> Unit) {
        launch(this, true, block)
    }
}

sealed class HandlerContext(private val handler: Handler) :
        AbstractCoroutineContextElement(ContinuationInterceptor), ContinuationInterceptor {

    constructor(looper: Looper) : this(Handler(looper))

    override fun <T> interceptContinuation(continuation: Continuation<T>): Continuation<T> =
            HandlerContinuation(continuation.context.fold(continuation, { cont, element ->
                if (element != this@HandlerContext && element is ContinuationInterceptor)
                    element.interceptContinuation(cont) else cont
            }))

    private inner class HandlerContinuation<T>(val continuation: Continuation<T>) : Continuation<T> by continuation {
        override fun resume(value: T) {
            if (isHandlerThread()) continuation.resume(value)
            else handler.post { continuation.resume(value) }
        }

        override fun resumeWithException(exception: Throwable) {
            if (isHandlerThread()) continuation.resumeWithException(exception)
            else handler.post { continuation.resumeWithException(exception) }
        }
    }

    private fun isHandlerThread() = Looper.myLooper() == handler.looper
}
