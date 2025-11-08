package com.example.kotlinaction.chapterfour

fun main() {
    val bob = Client("Bob", 973293)
    val copy = bob.copy(postalCode = 382555)
    println(bob)
    println(copy)
}

data class Client(val name: String, val postalCode: Int)