package com.example.kotlinaction.chaptertwo

fun main() {
    println("Sum evaluation: ${eval(Sum(Sum(Num(1), Num(2)), Num(4)))}")
    println("Sum evaluation: ${evalRefactor(Sum(Sum(Num(1), Num(2)), Num(4)))}")
}

interface Expr
class Num(val num: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(expr: Expr): Int {
    if (expr is Num) {
        val n = expr as Num
        return n.num
    }
    if (expr is Sum) {
        return eval(expr.left) + eval(expr.right)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun evalRefactor(expr: Expr): Int =
    when (expr) {
        is Num -> expr.num
        is Sum -> evalRefactor(expr.left) + evalRefactor(expr.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }