package com.example.kotlinaction.chapterfour

fun main() {
    val user1 = UserNotCompanionObj("regis@gmail.com")
    println("user not companion object: ${user1.nickname}")

    val user2 = UserCompanionObject.newSubscribingUser("regis@gmail.com").nickname
    println("user with companion object: $user2")
}

class UserNotCompanionObj {
    val nickname: String

    constructor(email: String) {
        nickname = email.substringBefore("@")
    }

    constructor(accountId: Int) {
        nickname = getNicknameByAccountId(accountId)
    }

    private fun getNicknameByAccountId(id: Int): String {
        return if (id == 1) "Regis" else "User Not Found"
    }
}

class UserCompanionObject private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) = UserCompanionObject(email.substringBefore("@"))
    }
}