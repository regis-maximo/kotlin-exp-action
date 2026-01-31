package com.example.kotlinaction.chapterfive

fun main() {
    val names = listOf("Ana", "Bruno", "Carlos", "Daniela")

    val myAdapterSimulator = MyAdapterSimulator(names) { position ->
        val name = names[position]
        println("Action executed in main: The clicked name was '$name'.")
    }

    myAdapterSimulator.simulateClick(2)
    println("---")
    myAdapterSimulator.simulateClick(0)
    println("---")
    myAdapterSimulator.simulateClick(5)

}


fun interface OnItemClickListener {
    fun onItemClicked(position: Int)
}
class MyAdapterSimulator(private val items: List<String>, private val listener: OnItemClickListener) {

    fun simulateClick(position: Int) {
        if (position in items.indices) {
            println("Item in position $position ('${items[position]}') It was clicked.")
            listener.onItemClicked(position)
        } else {
            println("Position $position is invalid.")
        }
    }
}