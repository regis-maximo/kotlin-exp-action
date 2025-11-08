package com.example.kotlinaction.chapterfive

fun main() {
    val errors = listOf("404 Not found", "400 Bad Request")
    printMessageWithPrefix(errors, "Error:")

    var counter = 0
    val inc = { counter++ }

    for (init in 1..10) {
        println("${inc()}")
    }
}

fun printMessageWithPrefix(message: Collection<String>, prefix: String) {
    message.forEach {
        println("$prefix $it")
    }
}