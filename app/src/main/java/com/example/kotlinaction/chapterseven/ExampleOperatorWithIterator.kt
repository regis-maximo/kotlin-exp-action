package com.example.kotlinaction.chapterseven

import java.time.LocalDate

fun main() {
    val newYear = LocalDate.ofYearDay(2017, 1)
    val daysOff = newYear.minusDays(1)..newYear
    for (dayOff in daysOff) println(dayOff)
}

operator fun ClosedRange<LocalDate>.iterator() =
    object : Iterator<LocalDate> {
        var current = start
        override fun hasNext() =
            current <= endInclusive

        override fun next(): LocalDate = current.apply {
            current = plusDays(1)
        }
    }