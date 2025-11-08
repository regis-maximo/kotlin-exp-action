package com.example.kotlinaction.chapterfive

fun main() {
    val canBeInClub27 = { p: Person -> p.age <= 27 }
    val people = listOf(Person("Alice", 27), Person("Bob", 31), Person("Carol", 27))
    println(people.find(canBeInClub27))
    println(people.firstOrNull(canBeInClub27))
    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))
    println(people.count(canBeInClub27))

    val list = listOf(1, 2, 3)
    println(!list.all { it == 3 })
    println(list.any { it != 3 })

    println(people.groupBy { it.age })
}