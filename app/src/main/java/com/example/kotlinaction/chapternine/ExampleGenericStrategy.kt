package com.example.kotlinaction.chapternine

fun main() {
    val csv = ApplicationProcessor(CsvProcessor())
    val json = ApplicationProcessor(JsonProcessor())

    csv.processData("order.csv")
    json.processData("order.json")
}

interface DataProcessor {
    fun processor(filename: String)
}

class CsvProcessor : DataProcessor {
    override fun processor(filename: String) {
        println("Processing CSV file...\n")
    }
}

class JsonProcessor : DataProcessor {
    override fun processor(filename: String) {
        println("Processing JSON file...\n")
    }
}

class ApplicationProcessor<out T : DataProcessor>(private val strategy: T) {
    fun processData(file: String) {
        strategy.processor(file)
    }
}