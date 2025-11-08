package com.example.kotlinaction.chapterfour

import android.content.Context
import android.util.AttributeSet

fun main() {
}

open class ViewConstructorSecondary {
    constructor(ctx: Context) {
        println("ViewConstructorSecondary: $ctx")
    }

    constructor(ctx: Context, attr: AttributeSet) {
        println("ViewConstructorSecondary: $ctx, $attr")
    }

    constructor()
}

class MyButton : ViewConstructorSecondary() {
//    constructor(ctx: Context) : this(ctx, MY_STYLE) {}
//    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {}
}