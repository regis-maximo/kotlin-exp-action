package com.example.kotlinaction.chapterfive

import com.example.kotlinaction.chapterfive.java.functional.GreetingMessage
import com.example.kotlinaction.chapterfive.java.functional.PostComputation

fun main() {
    postComputation().postponeComputation(1000) { println("post computation...") }

    helloWorldFunctionalInterface("Hello World!").run()
    calculateSum(4, 6).run()
}

fun postComputation(): PostComputation {
    return PostComputation { delay, runnable -> print("$delay ms delay to "); runnable.run() }
}

fun helloWorldFunctionalInterface(message: String): GreetingMessage {
    return GreetingMessage {
        println(
            message
        )
    }
}

fun calculateSum(n1: Int, n2: Int): GreetingMessage {
    return GreetingMessage {
        println(
            n1 + n2
        )
    }
}

