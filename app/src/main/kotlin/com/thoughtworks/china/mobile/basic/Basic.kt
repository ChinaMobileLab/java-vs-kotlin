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

class BasicFunctionKT {

    fun sum(a: Int, b: Int) = a + b

    fun sum(a: Int?, b: Int?): Int? {
        requireNotNull(a)
        requireNotNull(b)
        return a!! + b!!
    }
}

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val factory = SessionFactoryKT
        println(factory.provideKotlinSession())
        val basicFunction = BasicFunctionKT()
        println("1+1=${basicFunction.sum(1, 1)}")
        println(basicFunction.sum(null, 1))
    }
}
