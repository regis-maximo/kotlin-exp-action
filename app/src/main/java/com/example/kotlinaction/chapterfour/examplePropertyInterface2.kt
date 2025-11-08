package com.example.kotlinaction.chapterfour

fun main() {
    val userBanking = UserBanking("john-kennedy@gmail.com")
    println(userBanking.nickname)
}

interface UserPropertyInterfaceBackingField {
    val email: String
    val nickname: String get() = email.substringBefore("@")
}

class UserBanking(override val email: String) : UserPropertyInterfaceBackingField
