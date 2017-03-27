package com.thoughtworks.china.mobile.inlinefunction

import com.google.gson.Gson

object InlinedFunctionDemo {

    fun addAccount(username: String, password: String): String {
        val token = measureTime("login") {
            login(username, password)
        }
        return measureTime("fetch user detail") {
            fetchUserDetail(token)
        }
    }


    fun <T> measureTime(msg: String, body: () -> T): T {
        val start = System.currentTimeMillis()
        val result = body()
        println("$msg ${System.currentTimeMillis() - start}ms")
        return result
    }

    @JvmStatic
    fun main(args: Array<String>) {
        addAccount("", "")
    }

    private fun login(username: String, password: String): String {
        Thread.sleep(100)
        return "a290bGluCg=="
    }

    private fun fetchUserDetail(token: String): String {
        Thread.sleep(200)
        return "user info"
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
