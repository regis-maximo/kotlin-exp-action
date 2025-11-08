package com.example.kotlinaction.chaptersix

fun main() {
    printHashCodeNullable(null)
    printHashCode("null")
}

fun <T> printHashCodeNullable(t: T) {
    println(t?.hashCode())
}

fun <T: Any> printHashCode(t: T) {
    println(t.hashCode())
}