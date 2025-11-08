package com.example.kotlinaction.chapterseven.delegateperson

fun main() {
    val p = PersonWithDelegate("Alice", 29, 2000)
    p.addPropertyChangeListener { event ->
        println("changed ${event.propertyName} from ${event.oldValue} to ${event.newValue}")
    }
    p.age = 30
    p.salary = 3000
}