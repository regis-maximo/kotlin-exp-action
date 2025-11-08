package com.example.kotlinaction.chapterfour

class CountingSet<T>(private val innerSet: MutableCollection<T> = HashSet<T>()) :
    MutableCollection<T> by innerSet {
        var objectAdded = 0

    override fun add(element: T): Boolean {
        objectAdded++
        return innerSet.add(element)
    }
    override fun addAll(elements: Collection<T>): Boolean {
        objectAdded += elements.size
        return innerSet.addAll(elements)
    }
}

fun main() {
    val cSet = CountingSet<Int>()
    cSet.addAll(listOf(1, 1, 2))
    println("${cSet.objectAdded} objects were added, ${cSet.size} remain")
}