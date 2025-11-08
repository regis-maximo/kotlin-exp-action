package com.example.kotlinaction.chapterseven

fun main() {
    val p = Person7("Alice")
    for (email in p.emails) {
        println("\nFROM: ${email.from}\nTO: ${email.to}\nSUBJECT: ${email.subject}\nBODY: ${email.body}")
    }
    println("=====================================================================================")
    val p2 = Person7Refactor("Alice")
    for (email in p2.emails) {
        println("\nFROM: ${email.from}\nTO: ${email.to}\nSUBJECT: ${email.subject}\nBODY: ${email.body}")
    }
}

class Email(val from: String, val to: String, val subject: String, val body: String)

fun loadEmail(person7: Person7): List<Email> {
    println("Load emails for ${person7.name}")
    return listOf(
        Email(
            "jetbrains@gmail.com",
            "regis.santos@f1rst.com.br",
            "RELEASE 12032025 - Dossier Management",
            "Please, I need your comparison response for tonight's release deployment. I'll be waiting!"
        ),
        Email(
            "santanderbr@santander.com",
            "regis.santos@f1rst.com.br",
            "Congratulations",
            "Happy New Year!"
        )
    )
}

fun loadEmailRefactor(person7Refactor: Person7Refactor): List<Email> {
    println("Load emails for ${person7Refactor.name}")
    return listOf(
        Email(
            "jetbrains@gmail.com",
            "regis.santos@f1rst.com.br",
            "RELEASE 12032025 - Dossier Management",
            "Please, I need your comparison response for tonight's release deployment. I'll be waiting!"
        ),
        Email(
            "santanderbr@santander.com",
            "regis.santos@f1rst.com.br",
            "Congratulations",
            "Happy New Year!"
        )
    )
}

class Person7(val name: String) {
    private var _emails: List<Email>? = null
    val emails: List<Email>
        get() {
            if (_emails == null) {
                _emails = loadEmail(this)
            }
            return _emails!!
        }
}

class Person7Refactor(val name: String) {
    val emails by lazy { loadEmailRefactor(this) }
}