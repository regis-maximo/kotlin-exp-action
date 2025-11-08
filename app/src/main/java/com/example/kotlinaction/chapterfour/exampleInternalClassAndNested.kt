package com.example.kotlinaction.chapterfour

import java.io.Serializable

fun main() {
    val buttonState = ButtonView.ButtonState()
}

interface State : Serializable
interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class ButtonView : View {
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {

    }

    class ButtonState : State
}