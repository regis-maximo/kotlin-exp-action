package com.example.kotlinaction.chapterfour

fun main() {
    // SAM (Single Abstract Method
    // anonymous
    val callWithAnonymous = object : Runnable {
        override fun run() {
            println("Here is this Anonymous!")
        }
    }

    // lambda
    val callWithLambda = Runnable {
        println("Here is this Lambda!")
    }

    callWithAnonymous.run()
    callWithLambda.run()
}

