package com.example.kotlinaction.chapternine

fun main() {
    println(listOf(1, 2, 3, 4).penultimate)
    println(oneHalf(25))
    println(max("Kotlin", "Java"))

    val helloWorld = StringBuilder("Hello World")
    ensureTrailingPeriod(helloWorld)
    println(helloWorld)
}

// extension property
val <T> List<T>.penultimate: T
    get() = this[size - 2]

// upper bound constraint
fun <T : Number> oneHalf(other: T): Double {
    return other.toDouble() / 2.0
}

// Declaring a function with a restriction on the type parameter
fun <T : Comparable<T>> max(first: T, second: T): T {
    return if (first > second) first else second
}

// Specifying Multiple Constraints for a Type Parameter
fun <T> ensureTrailingPeriod(seq: T) where T : CharSequence, T : Appendable {
    if (!seq.endsWith('.')) {
        seq.append('.')
    }
}