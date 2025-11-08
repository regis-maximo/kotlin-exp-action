package com.example.kotlinaction.chapterfive

fun main() {
    println(sum(3, 4) { a, b -> a + b })
    println(sub(3, 4) { a, b -> a - b })
    println(multi(3, 4) { a, b -> a * b })
    println(div(3, 4) { a, b -> a / b })
}

fun sum(valueA: Int, valueB: Int, operation: (Int, Int) -> Int): Int = operation(valueA, valueB)

fun sub(valueA: Int, valueB: Int, operation: (Int, Int) -> Int): Int = operation(valueA, valueB)

fun div(valueA: Int, valueB: Int, operation: (Int, Int) -> Int): Int = operation(valueA, valueB)

fun multi(valueA: Int, valueB: Int, operation: (Int, Int) -> Int): Int = operation(valueA, valueB)