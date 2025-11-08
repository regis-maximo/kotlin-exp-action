package com.example.kotlinaction.chapterfive

fun main() {
    val sum = { a: Int, b: Int ->
        println("Computing the sum of $a and $b...")
        a + b
    }
    println(sum(1, 3))

    val people = listOf(
        Person("Ana", 34),
        Person("Pedro", 96),
        Person("Joao", 96),
        Person("Paulo", 51)
    )

    val names1 = people.joinToString(" - ", transform = { it.name })
    println(names1)
    val names2 = people.joinToString(" _ ") { p: Person -> p.name }
    println(names2)
    val names3 = people.joinToString("; ", transform = (Person::name))
    println(names3)
}

data class Person(val name: String, val age: Int)