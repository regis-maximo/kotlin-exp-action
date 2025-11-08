package com.example.kotlinaction.chapterthree

fun main() {
    val args = arrayOf("Kotlin", "Java", "Python")
    val list = listOf("args: ", 1, *args)
    println(list)
}