package com.example.kotlinaction.chaptereight

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val filterEven = { num: Int -> num % 2 == 0 }
    val doubleValue = { num: Int -> num * 2 }

    println(processList(numbers, filterEven, doubleValue))
}

fun processList(
    numbers: List<Int>,
    filter: (Int) -> Boolean,
    transform: (Int) -> Int
): List<Int> {
    return numbers.filter(filter).map(transform)
}