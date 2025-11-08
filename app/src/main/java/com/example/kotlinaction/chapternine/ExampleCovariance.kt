package com.example.kotlinaction.chapternine

fun main() {
    val oranges = CovariantCrate(listOf(Orange(), Orange(), Orange()))
    isSafe(oranges)
}

open class Fruit {
    fun isSafeToEat() = true
}

class Apple : Fruit()
class Orange : Fruit()

// Invariant
class Crate<T>(val elements: MutableList<T>) {
    fun add(t: T) = elements.add(t)
    fun last(): T = elements.last()
}

class CovariantCrate<out T>(val elements: List<T>) {
//    fun last(): T = elements.last()
}

//fun isSafe(crate: Crate<Fruit>) = crate.elements.all { it.isSafeToEat() } // doesn't compile
fun isSafe(crate: CovariantCrate<Fruit>) = crate.elements.all { it ->
    println(it.isSafeToEat())
    it.isSafeToEat()
}