package com.example.kotlinaction.chapterfour

fun main() {
    println(evaluate(1, 2) { n1, n2 -> sum(n1, n2) })
    println(evaluate(10, 2, ::sub))
    println(evaluate(30, 2, ::mul))
    println(evaluate(10, 2, ::div))
    println(evaluate(10, 2, ::maxOf))
    println(evaluate(10, 2, ::minOf))
}

fun evaluate(n1: Int, n2: Int, operation: (Int, Int) -> Int): Int = operation(n1, n2)
fun sum(n1: Int, n2: Int): Int = n1 + n2
fun sub(n1: Int, n2: Int): Int = n1 - n2
fun mul(n1: Int, n2: Int): Int = n1 * n2
fun div(n1: Int, n2: Int): Int = n1 / n2

