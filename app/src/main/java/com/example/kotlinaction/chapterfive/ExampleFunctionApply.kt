package com.example.kotlinaction.chapterfive

fun main() {
    println(alphabetApply())

    val newDog = newDog("Sheik", 2)
    println(newDog)
    println(newDog.song)
}

fun alphabetApply() = StringBuilder().apply {
    for (letter in 'A'..'Z') append(letter)
    append("\nNow I know the alphabet!")
}.toString()

data class Dog(private val name: String, private val age: Int) {
    lateinit var song: String
}

fun newDog(name: String, age: Int) = Dog(name, age).apply {
   song = "Au au au au"
}