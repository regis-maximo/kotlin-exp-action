package com.example.kotlinaction.chaptereight

fun main() {
    val contacts = listOf(
        Person("Dmitry", "Jemerov", "123-4567"), Person("Svetlana", "Isakova", null)
    )
    val contactListFilters = ContactListFilters()
    with(contactListFilters) {
        prefix = "Dm"
        onlyWithPhoneNumber = true
    }
    println(contacts.filter(contactListFilters.getPredicate()))
}

data class Person(val firstname: String, val lastname: String, var phoneNumber: String?)

class ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false

    fun getPredicate(): (Person) -> Boolean {
        val startWithPrefix = { p: Person ->
            p.firstname.startsWith(prefix) || p.lastname.startsWith(prefix)
        }
        if (!onlyWithPhoneNumber) {
            return startWithPrefix
        }
//        return { p: Person -> startWithPrefix(p) && p.phoneNumber != null }
        return { startWithPrefix(it) && it.phoneNumber != null }
    }
}