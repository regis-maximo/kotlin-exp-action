package com.example.kotlinaction.chapterfour

fun main() {
    val companionObject = loadFromJSON(PersonCompanionObject)
    println(">>> ${companionObject.name}")
}

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

class PersonCompanionObject(val name: String) {
    companion object : JSONFactory<PersonCompanionObject> {
        override fun fromJSON(jsonText: String): PersonCompanionObject {
            return PersonCompanionObject(jsonText.removePrefix("{").removeSuffix("}"))
        }
    }
}

fun <T> loadFromJSON(factory: JSONFactory<T>): T {
    return factory.fromJSON("{json}")
}