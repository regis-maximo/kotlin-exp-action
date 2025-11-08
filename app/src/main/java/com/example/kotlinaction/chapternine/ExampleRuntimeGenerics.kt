package com.example.kotlinaction.chapternine

fun main() {
    printSum(listOf(1, 2, 3))
    printSum(listOf("a", "b", "c"))
}

fun printSum(c: Collection<*>) {
    val intList = c as? List<Int>
        ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}