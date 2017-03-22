package com.thoughtworks.china.mobile.inlinefunction

import com.google.gson.Gson
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

object InlinedFunctionDemo {

    inline fun <T> lock(lock: Lock, body: () -> T): T {
        lock.lock()
        val result = body()
        lock.unlock()
        return result
    }
    fun demoInline(): String {
        val lock = ReentrantLock()
        lock(lock) {
            return "test"
        }
    }

    inline fun <reified T> fromJson(json: String): T {
        return Gson().fromJson(json, T::class.java)
    }

    fun demoReified(): String = fromJson("test")

    inline var str: String
        get() {
            return ""
        }
        set(v) {}
}
