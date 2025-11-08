package com.example.kotlinaction.chapterfour


fun main() {
    val persons = listOf(
        Person("Regis Maxim", 10300.00),
        Person("Fernanda Nascimento", 7100.00),
        Person("Lisa Nicasio", 12600.00)
    )

    Payroll.allEmployees.addAll(persons)
    Payroll.calculateSalary()
}

object Payroll {
    val allEmployees = ArrayList<Person>()

    fun calculateSalary() {
        for (person in allEmployees) {
            println("Employer ${person.name} salary mouth march is: ${person.salary}")
        }
    }
}

class Person(val name: String, val salary: Double)