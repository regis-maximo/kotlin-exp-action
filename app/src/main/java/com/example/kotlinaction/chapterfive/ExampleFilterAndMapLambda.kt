package com.example.kotlinaction.chapterfive


fun main() {
    val list = listOf(1, 4, 5, 9, 2, 6, 7)
    println(list.filter { it % 2 == 0 })

    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.filter { it.age > 30 })
}