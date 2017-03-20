package com.thoughtworks.china.mobile.varval

object ValVarKT {

    private var phase: String? = null
    private const val mobileOpenDay = "Mobile Open Day"
    private val topics = """
    |《三生三世iOS布局》
    |《移动测试的Mock实践》
    |《Getting Start with Kotlin on Android》
    """.trimMargin()

    @JvmStatic
    fun main(args: Array<String>) {
        val valvar = ValVarKT
        valvar.phase = "4th"

        println("Welcome to " + mobileOpenDay + " " + valvar.phase)
        println("Welcome to $mobileOpenDay ${valvar.phase}")
        println(topics)
    }
}