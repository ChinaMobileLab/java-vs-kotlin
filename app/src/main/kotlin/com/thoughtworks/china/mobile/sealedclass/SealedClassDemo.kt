package com.thoughtworks.china.mobile.sealedclass

sealed class Expr

data class Const(val number: Int) : Expr()
data class Add(val e1: Expr, val e2: Expr) : Expr()
data class Minus(val e1: Expr, val e2: Expr) : Expr()
data class Multiple(val e1: Expr, val e2: Expr) : Expr()
data class Divide(val e1: Expr, val e2: Expr) : Expr()

fun Expr.eval(): Const =
        when (this) {
            is Const -> this
            is Add -> Const(e1.eval().number + e2.eval().number)
            is Minus -> Const(e1.eval().number - e2.eval().number)
            is Multiple -> Const(e1.eval().number * e2.eval().number)
            is Divide -> Const(e1.eval().number / e2.eval().number)
        }


object Main {
    @JvmStatic fun main(args: Array<String>) {
        // 5+4-3*2/1
        println("${Minus(Add(Const(5), Const(4)), Divide(Multiple(Const(3), Const(2)), Const(1))).eval()}")
    }
}