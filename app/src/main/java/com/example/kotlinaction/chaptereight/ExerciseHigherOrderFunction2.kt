package com.example.kotlinaction.chaptereight

fun main() {
    val discountTenPercentage = { x: Double -> x * 0.9 }
    val discountProgressive = { x: Double -> if (x > 500) x * 0.8 else x * 0.95 }

    val products = listOf(
        Product("Book", 100.0),
        Product("Mobile Phone", 1500.0),
        Product("Phone", 200.0),
    )

    println(
        "discount ten percentage: ${
            evaluateDiscount(
                products,
                discountTenPercentage
            ).joinToString(prefix = "[", postfix = "]")
        }"
    )
    println(
        "discount ten progressive: ${
            evaluateDiscount(
                products,
                discountProgressive
            ).joinToString(prefix = "[", postfix = "]")
        }"
    )
}

data class Product(val name: String, val price: Double)

fun evaluateDiscount(products: List<Product>, discount: (Double) -> Double): List<Product> {
    return products.map { prod -> Product(prod.name, discount(prod.price)) }
}