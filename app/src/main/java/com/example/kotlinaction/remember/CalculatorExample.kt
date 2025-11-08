package com.example.kotlinaction.remember

fun main() {
    userInput()
}

fun calculator(n1: Double, n2: Double, operation: (Double, Double) -> Double) = operation(n1, n2)
fun sum(n1: Double, n2: Double) = calculator(n1, n2) { a, b -> a + b }
fun sub(n1: Double, n2: Double) = calculator(n1, n2) { a, b -> a - b }
fun mul(n1: Double, n2: Double) = calculator(n1, n2) { a, b -> a * b }
fun div(n1: Double, n2: Double) = calculator(n1, n2) { a, b -> a / b }

fun userInput() {
    do {
        println("Welcome to the Calculator")
        println(
            "What operation do you intend to perform?\n 1 - Sum\n 2 - Sub\n 3 - Mul\n 4 - Div\n 0 - To go out"
        )
        var option = readln().toIntOrNull() ?: 0
        when (option) {
            0 -> println("Shutting down system")
            1 -> {
                println("sum option!")
                println("first number entry:")
                val n1 = readln().toDoubleOrNull() ?: 0.0
                println("second number entry:")
                val n2 = readln().toDoubleOrNull() ?: 0.0
                println("$n1 + $n2 = ${removeZeroDecimal(sum(n1, n2))}")
            }

            2 -> {
                println("sub option!")
                println("first number entry:")
                val n1 = readln().toDoubleOrNull() ?: 0.0
                println("second number entry:")
                val n2 = readln().toDoubleOrNull() ?: 0.0
                println("$n1 + $n2 = ${removeZeroDecimal(sub(n1, n2))}")
            }

            3 -> {
                println("mul option!")
                println("first number entry:")
                val n1 = readln().toDoubleOrNull() ?: 0.0
                println("second number entry:")
                val n2 = readln().toDoubleOrNull() ?: 0.0
                println("$n1 + $n2 = ${removeZeroDecimal(mul(n1, n2))}")
            }

            4 -> {
                println("div option!")
                println("first number entry:")
                val n1 = readln().toDoubleOrNull() ?: 0.0
                println("second number entry:")
                val n2 = readln().toDoubleOrNull() ?: 0.0
                println("$n1 + $n2 = ${removeZeroDecimal(div(n1, n2))}")
            }

            else -> {
                println("invalid option, shutting down the system!")
                option = 0
            }
        }
    } while (option != 0)
}

fun removeZeroDecimal(number: Double): String {
    return if (number == number.toInt().toDouble()) {
        number.toInt().toString()
    } else {
        number.toString()
    }
}