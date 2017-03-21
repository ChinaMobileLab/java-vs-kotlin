package com.thoughtworks.china.mobile.extension


fun Double.km() = this * 1_000.0

fun Double.m() = this

fun Double.cm() = this / 100.0

fun Double.mm() = this / 1_000.0

fun Double.ft() = this / 3.28084

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val value: Double = 2.0
        println("""
        |km: ${value.km()}
        |m: ${value.m()}
        |cm: ${value.cm()}
        |mm: ${value.mm()}
        |ft: ${value.ft()}
""".trimMargin())
    }
}