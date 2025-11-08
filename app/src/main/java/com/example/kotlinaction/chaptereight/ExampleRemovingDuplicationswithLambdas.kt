package com.example.kotlinaction.chaptereight

fun main() {
    val log = listOf(
        SiteVisit("/", 34.0, OS.WINDOWS),
        SiteVisit("/", 22.0, OS.MAC),
        SiteVisit("/login", 12.0, OS.WINDOWS),
        SiteVisit("/signup", 8.0, OS.IOS),
        SiteVisit("/", 16.3, OS.ANDROID)
    )

    val averageWindowsDuration = log
        .filter { it.os == OS.WINDOWS }
        .map(SiteVisit::duration)
        .average()

    println(averageWindowsDuration)
    println(log.averageDurationFor(OS.MAC))

    // Analyzing website visit data with a complex filter fixed in the code
    val averageMobileDuration = log
        .filter { it.os in setOf(OS.IOS, OS.ANDROID) }
        .map(SiteVisit::duration)
        .average()
    println(averageMobileDuration)

    // Eliminating duplication with a common function
    println(log.averageDurationFor { it.os == OS.IOS && it.path == "/signup" })
}

data class SiteVisit(val path: String, val duration: Double, val os: OS)

enum class OS {
    WINDOWS, LINUX, MAC, IOS, ANDROID
}

// Eliminating duplication with a common function
fun List<SiteVisit>.averageDurationFor(os: OS) =
    filter { it.os == os }.map(SiteVisit::duration).average()

// Eliminating duplication with a higher-order function
fun List<SiteVisit>.averageDurationFor(predicate: (SiteVisit) -> Boolean) =
    filter(predicate).map(SiteVisit::duration).average()