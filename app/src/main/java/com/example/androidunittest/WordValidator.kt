package com.example.androidunittest

class WordValidator {
    fun getGreetingMessage(name: String): String {
        return if (name.isEmpty()) {
            "Input tidak boleh kosong!"
        } else {
            "Halo, $name!"
        }
    }
}