package com.thoughtworks.china.mobile.delegateproperty

import kotlin.reflect.KProperty

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "reading $thisRef ${property.name}"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("modifying $thisRef ${property.name} to $value")
    }
}

object Main {
    var test: String by Delegate()
    @JvmStatic fun main(args: Array<String>) {
        test = "a"
        println(test)
    }
}
