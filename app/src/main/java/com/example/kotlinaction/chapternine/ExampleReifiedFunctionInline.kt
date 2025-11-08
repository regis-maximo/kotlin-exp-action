package com.example.kotlinaction.chapternine

fun main() {
    println(isA<String>("abc"))
    println(isA<String>(123))

    val items = listOf("One", 2, "three")
    println(items.filterIsInstance<String>())
    println(items.myFilterIsInstance<String>())
}

inline fun <reified T> isA(value: Any) = value is T

inline fun <reified T> Iterable<*>.myFilterIsInstance(): List<T> {
    val destination = mutableListOf<T>()
    for (element in this) {
        if (element is T) {
            destination.add(element)
        }
    }
    return destination
}