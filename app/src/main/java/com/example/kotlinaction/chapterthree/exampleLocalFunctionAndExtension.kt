package com.example.kotlinaction.chapterthree

fun main() {
//    saveUserCasual(User(1, "", ""))
    User(1, "", "").saveUser() // with function extension
}

data class User(val id: Int, val name: String, val address: String)

fun saveUserCasual(user: User) {
    fun validate(value: String, field: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $field")
        }
    }
    validate(user.name, "name")
    validate(user.address, "address")
    println("User ${user.id} saved!")
}

// with function extension
fun User.saveUser() {
    fun validate(value: String, field: String) {
        if (value.isEmpty()) throw IllegalArgumentException("Can't save user $id: empty $field")
    }
    validate(name, "name")
    validate(address, "address")
    println("User $id saved!")
}