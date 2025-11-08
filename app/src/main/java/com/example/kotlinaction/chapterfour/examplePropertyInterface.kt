package com.example.kotlinaction.chapterfour

fun main() {
    val privateUser = PrivateUser("Regis Lucas")
    val subscribingUser = SubscribingUser("regishallowed@gmail.com")
    val facebookUser = FacebookUser(2)

    println("privateUser: ${privateUser.nickname}")
    println("subscribingUser: ${subscribingUser.nickname}")
    println("facebookUser: ${facebookUser.nickname}")
}

interface UserPropertyInterface {
    val nickname: String
}

class PrivateUser(override val nickname: String) : UserPropertyInterface

class SubscribingUser(private val email: String) : UserPropertyInterface {
    override val nickname: String
        get() = email.substringBefore("@")
}

class FacebookUser(accountId: Int) : UserPropertyInterface {
    override val nickname: String = getAccountId(accountId)

    private fun getAccountId(accountId: Int): String {
        return if (accountId == 1) "Regis" else "AnyUser"
    }
}
