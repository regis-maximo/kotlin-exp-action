package com.example.kotlinaction.chapterfour

import java.io.File

fun main() {
    println(
        CaseInsensitiveFileComparator.compare(
            File("/User"), File("/user")
        )
    )

    val files = listOf(
        File("/Z"),
        File("/a"),
        File("/c"),
        File("/b")
    )

    println(files.sortedWith(CaseInsensitiveFileComparator))
}

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File): Int {
        return file1.path.compareTo(file2.path, ignoreCase = true)
    }
}