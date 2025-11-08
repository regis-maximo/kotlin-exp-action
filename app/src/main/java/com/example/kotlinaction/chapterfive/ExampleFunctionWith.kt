package com.example.kotlinaction.chapterfive

fun main() {
    println(alphabetNotWith())
    println("\n${alphabet()}")
    println("\n${alphabetRefactor()}")
}

fun alphabetNotWith(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()
}

fun alphabet(): String {
    val result = StringBuilder()
    return with(result) {
        for (letter in 'A'..'Z') {
            append(letter)
        }
        result.append("\nNow I know the alphabet!")
        toString()
    }
}

fun alphabetRefactor() = with(StringBuilder()) {
    for (letter in 'A'..'Z') append(letter)
    append("\nNow I know the alphabet!")
    toString()
}