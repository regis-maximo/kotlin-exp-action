package com.example.kotlinaction.chaptersix

fun main() {
    val person1 = Person("Dmitry", null)
    println(person1.countryName())
    println("------------------------")

    val address = Address("Elsetr, 47", 80687, "Munich", "Germany")
    val jetbrains = Company("Jetbrains", address)
    val person2 = Person("Regis", jetbrains)

    printShippingLabel(person2)
    printShippingLabel(Person("Dmitry", null))
}

class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)
class Company(val name: String, val address: Address?)
class Person(val name: String, val company: Company?)

fun Person.countryName() = company?.address?.country ?: "Unknown"

fun printShippingLabel(person: Person) {
    val address = person.company?.address
        ?: throw IllegalArgumentException("No Address")
    with(address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}



