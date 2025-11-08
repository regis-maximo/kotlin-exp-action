package com.example.kotlinaction.chapterthree

import kotlin.jvm.internal.Intrinsics.Kotlin

fun main() {
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)

    val sb2 = StringBuilder("Java?")
    sb2.lastChar = '!'
    println(sb2)

    println(">>> ${"Kotlin".lastChar}")
    println(">>> ${"Kotlin".firstChar()}")
}

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value) {
        setCharAt(length - 1, value)
    }

val String.lastChar: Char
    get() = get(length - 1)

fun String.firstChar(): Char = get(0)