package com.example.kotlinaction.chapterthree

fun main() {
    val collection = listOf(1, 5, 9)
    println(joinToString(collection, "(", "; ", ")"))
    println(joinToString(collection))
    println(joinToString(collection, ""," | "))
}

fun <T> joinToString(
    collection: Collection<T>,
    prefix: String = "",
    separator: String = ", ",
    postfix: String = ""
): String {

    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}