package com.thoughtworks.china.mobile.collection

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val integers = mutableListOf(1, 2, 3)
        integers.add(4)

        (1..10)
                .filter { it % 2 == 1 }
                .map { it * it }
                .reduce { acc, i -> acc + i }
                .apply { println(this) }
    }
}
