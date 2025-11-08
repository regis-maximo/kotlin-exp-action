package com.example.kotlinaction.chapterthree

fun main() {
    println("Kotlin".lastChar())
    println("Java".last())
    println()

    val collection = listOf(1, 5, 9)
    println(collection.joinToStringWithExtension( "(", "; ", ")"))
    println(collection.joinToStringWithExtension())
    println(collection.joinToStringWithExtension( ""," | "))
}

fun String.lastChar(): Char {
    if (isEmpty())
        throw NoSuchElementException("Char sequence is empty.")
    return this[lastIndex]
}

fun <T> Collection<T>.joinToStringWithExtension(
    prefix: String = "",
    separator: String = ", ",
    postfix: String = ""
): String {

    val result = StringBuilder(prefix)
    for ((index, element) in withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}