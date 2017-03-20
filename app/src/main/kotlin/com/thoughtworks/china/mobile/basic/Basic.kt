package com.thoughtworks.china.mobile.basic

data class SessionKT(val topic: String, val type: String, val speakers: MutableList<String>)

object SessionFactoryKT {

    fun provideKotlinSession(): SessionKT {
        val session = SessionKT(topic = "《Getting Start with Kotlin on Android》",
                type = "Android",
                speakers = mutableListOf("Zhang Shuai", "Wang Zhiyong"))
        return session
    }
}

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val factory = SessionFactoryKT
        println(factory.provideKotlinSession())
    }
}
