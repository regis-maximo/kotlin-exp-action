package com.example.kotlinaction.chapterfour

fun main() {
    val twitterUser = TwitterUser("regis")
    println(twitterUser.getNickname())
}

//open class User constructor(nickname: String) {
//    val nickname: String
//    init {
//        this.nickname = nickname
//    }
//}
open class User(private val nickname: String) {
    fun getNickname(): String = nickname
}

class TwitterUser(nickname: String) : User(nickname)