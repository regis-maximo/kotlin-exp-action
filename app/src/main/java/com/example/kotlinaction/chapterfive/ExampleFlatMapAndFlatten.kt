package com.example.kotlinaction.chapterfive

fun main() {
    val books = listOf(
        Book("Thursday Next", listOf("Jasper Fforde")),
        Book("Mort", listOf("Terry Pratchett")),
        Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman"))
    )

    println(books.flatMap { it.authors }.toSet())
    println(books.map { it.authors }.flatten().toSet()) // equals flatmap

    val deepArray = arrayOf(arrayOf(1), arrayOf(2, 3), arrayOf(4, 5, 6))
    println(deepArray.flatten())

    val deepList = listOf(listOf(1), listOf(2, 3), listOf(4, 5, 6))
    println(deepList.flatten())
}

class Book(val title: String, val authors: List<String>)