package com.example.kotlinaction.chapterthree

fun main() {
    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    println(map)

    val (number, name) = 1 to "one"
    println("number=${number}; name=${name}")

    val fileDirectory = """C:\Users\regis\OneDrive\Imagens\Capturas de tela\test.png"""
    val infoFile = parsePath(fileDirectory)
    println(infoFile?.print)
}

infix fun Any.to(other: Any) = Pair(this, other)

data class InfoFile(val directory: String, val filename: String, val extension: String) {
    val print: String
        get() = "Dir: $directory, name: $filename, ext: $extension";
}

fun parsePath(path: String): InfoFile? {
    val regex = """(.+)\\(.+)\.(.+)""".toRegex()
    val mathResult = regex.matchEntire(path)

    if (mathResult != null) {
        val (directory, filename, extension) = mathResult.destructured
        return InfoFile(directory, filename, extension)
    } else return null;
}

