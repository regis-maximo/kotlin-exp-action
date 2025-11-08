package com.example.kotlinaction.chapterfour

class LengthCount {
    var count = 0
        private set // change accessing method to private

    fun addWord(word: String) {
        count += word.length
    }
}