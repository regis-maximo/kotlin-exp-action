package com.example.kotlinaction.chapterfour

fun main() {
    val userAddress = UserAddress("Alice")
    userAddress.address = "3651 S Central Ave Flagger Beach, Florida"

    val lengthCount = LengthCount()
    lengthCount.addWord("new world")
    println("length word: ${lengthCount.count}")
}

class UserAddress(private val user: String) {
    var address: String = "Undefined"
        set(value) {
            println(
                """
                Address was changed for $user:
                "$field -> $value" 
            """.trimIndent()
            )
            field = value
        }
}