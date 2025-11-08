package com.example.kotlinaction.chapterfour

fun main() {

}

open class RichButton : Clickable {
    fun disable() {}
    open fun animate() {}
    final override fun click() {}
}

internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}

internal fun TalkativeButton.giveSpeech() {
//    yell()  error because yell is private
//    whisper() error because whisper is protected
}