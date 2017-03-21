package com.thoughtworks.china.mobile.coroutine

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.thoughtworks.china.mobile.R
import kotlinx.android.synthetic.main.activity_async_await.*
import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay

class AsyncAwaitActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async_await)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {
            UIContext {
                val str = async(CommonPool) {
                    delay(5000)
                    "this string is generated from backgroud thread"
                }
                Toast.makeText(this@AsyncAwaitActivity, "You clicked fab", Toast.LENGTH_LONG).show()
                textView.text = str.await()
            }
        }
    }

}
