package com.thoughtworks.china.mobile.delegation.kotlin

interface Base {
    fun print()
}

class BaseImpl(val value: Int) : Base {
    override fun print() { print(value) }
}

class Derived(b: Base) : Base by b


