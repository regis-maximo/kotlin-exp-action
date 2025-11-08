package com.example.kotlinaction.chaptersix

fun main() {
    val p1 = Person6("Regis", "Maximo")
    val p2 = Person6("Regis", "Maximo")
    println(p1 == p2)
    println(p1.equals(42))

    ignoreNulls(null)
}

class Person6(private val firstname: String, private val lastname: String) {
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? Person6 ?: return false
        return otherPerson.firstname == firstname && otherPerson.lastname == lastname
    }

    override fun hashCode(): Int {
        return firstname.hashCode() * 37 + lastname.hashCode()
    }
}

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}