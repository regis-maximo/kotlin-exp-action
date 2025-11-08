package com.example.kotlinaction.chaptertwo

import java.util.TreeMap

fun main() {
    for (i in 1..100) {
        print(fizzBuzz(i))
    }
    println()
    for (i in 100 downTo 1 step 2) {
        print(fizzBuzz(i))
    }
    println()
    printBinaryCharacter('A', 'F')

    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
    println()

    println(isLetter('q'))
    println(isNotDigit('x'))
    println()

    println(recognize('8'))
}

fun fizzBuzz(i: Int) =
    when {
        i % 15 == 0 -> "FizzBuzz "
        i % 3 == 0 -> "Fizz "
        i % 5 == 0 -> "Buzz "
        else -> "$i "
    }

fun printBinaryCharacter(start: Char, end: Char) {
    val binaryReps = TreeMap<Char, String>()
    for (i in start .. end) {
        val binary = Integer.toBinaryString(i.code)
        binaryReps[i] = binary
    }
    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
    println()
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'A'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) =
    when (c) {
        in '0'..'9' -> "It's a digit!"
        in 'a'..'z', in 'A'..'A' -> "It's a letter"
        else -> "I don't know!"
    }