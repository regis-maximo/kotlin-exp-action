package com.example.kotlinaction.chapterseven

fun main() {
    val (name, extension) = splitFilename("example.kt")
    println(name)
    println(extension)
}

class NameComponents(
    private val name: String, private val extension: String,
) {
    operator fun component1() =
        name // If there is additional data in the class, no operator is needed.

    operator fun component2() =
        extension // If there is additional data in the class, no operator is needed.
}

fun splitFilename(filename: String): NameComponents {
    val split = filename.split(".", limit = 2)
    return NameComponents(split[0], split[1])
}