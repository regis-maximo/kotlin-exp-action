package com.example.kotlinaction.chaptersix

fun main() {
    val email: String? = "yole@example.com"
    email?.let { sendEmail(it) }

    getTheBestPersonInTheWorld()?.let { sendEmail(it.email) }
}

fun sendEmail(email: String) {
    println("Sending email to $email")
}

fun getTheBestPersonInTheWorld(): Person6Dot9? = Person6Dot9("yole@example.com")

class Person6Dot9(val email: String)