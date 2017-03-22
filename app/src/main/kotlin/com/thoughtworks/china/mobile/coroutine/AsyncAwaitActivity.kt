package com.thoughtworks.china.mobile.coroutine

import android.os.AsyncTask
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.thoughtworks.china.mobile.R
import kotlinx.android.synthetic.main.activity_async_await.*
import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay

class AsyncAwaitActivity : AppCompatActivity() {
    fun toast(message: CharSequence) =
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async_await)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {
            UIContext {
                toast("You clicked fab")
                val str = async(CommonPool) {
                    delay(5000)
                    "this string is generated from background thread"
                }
                textView.text = str.await()
            }
        }

        fab.setOnClickListener {
            toast("You clicked fab")
            object : AsyncTask<Unit, Unit, String>() {

                override fun doInBackground(vararg params: Unit): String {
                    Thread.sleep(5000)
                    return "this string is generated from background thread"
                }

                override fun onPostExecute(str: String) {
                    textView.text = str
                }
            }.execute()
        }
    }

}
