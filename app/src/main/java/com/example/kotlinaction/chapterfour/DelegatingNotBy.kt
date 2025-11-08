package com.example.kotlinaction.chapterfour

class DelegatingNotBy<T> : Collection<T> {

    private val innerList = ArrayList<T>()

    override val size: Int get() = innerList.size

    override fun iterator(): Iterator<T> = innerList.iterator()

    override fun isEmpty(): Boolean = innerList.isEmpty()

    override fun containsAll(elements: Collection<T>): Boolean = innerList.containsAll(elements)

    override fun contains(element: T): Boolean = innerList.contains(element)
}

class DelegatingBy<T>(private val innerList: Collection<T> = ArrayList<T>()) : Collection<T> by innerList