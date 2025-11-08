package com.example.kotlinaction.chapterfive

fun main() {
    val sum = { x: Int, y: Int ->
        println("Computing the sum of $x and $y")
        x + y
    }
    println(sum(3, 2))
    println(calc(20, 30, sum))

    val persons = listOf(Person2(25), Person2(30), Person2(28))
    println(persons.maxAge { it.age })
}

fun calc(v1: Int, v2: Int, evaluate: (Int, Int) -> Int) = evaluate(v1, v2)

data class Person2(val age: Int)

fun List<Person2>.maxAge(selector: (Person2) -> Int): Person2? {
    if (isEmpty()) return null

    var maxElement = first()
    var maxValue = selector(maxElement)

    for (element in drop(1)) {
        val currentValue = selector(element)
        if (currentValue > maxValue) {
            maxValue = currentValue
            maxElement = element
        }
    }
    return maxElement
}