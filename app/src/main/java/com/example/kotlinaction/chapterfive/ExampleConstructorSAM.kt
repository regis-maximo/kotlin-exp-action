package com.example.kotlinaction.chapterfive

fun main() {
    createAllDoneRunnable().run()
}

fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") }
}

