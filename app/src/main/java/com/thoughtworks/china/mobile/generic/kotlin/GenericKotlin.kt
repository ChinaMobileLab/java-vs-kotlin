package com.thoughtworks.china.mobile.generic.kotlin


object Main {
    @JvmStatic fun main(args: Array<String>) {

        val strings = arrayOf("a")
        val charSequences: Array<out CharSequence> = strings

        fun <T> MutableList<T>.addAll(from: List<T>) = addAll(from)

        mutableListOf<CharSequence>().addAll(mutableListOf<String>("abc"))

    }
}
