package com.example.androidunittest

import org.junit.Assert.assertEquals
import org.junit.Test

class WordValidatorTest {

    /*
     * Unit Test 1: Menguji apakah fungsi getGreetingMessage mengembalikan
     * pesan yang benar jika inputan memiliki teks (valid).
     * Expected Result: "Halo, Budi!"
     */
    @Test
    fun testGreetingMessage_withValidInput_returnsCorrectString() {
        val validator = WordValidator()
        val result = validator.getGreetingMessage("Budi")
        assertEquals("Halo, Budi!", result)
    }

    /*
     * Unit Test 2: Menguji apakah fungsi getGreetingMessage mengembalikan
     * pesan peringatan jika inputan berupa string kosong.
     * Expected Result: "Input tidak boleh kosong!"
     */
    @Test
    fun testGreetingMessage_withEmptyInput_returnsWarningString() {
        val validator = WordValidator()
        val result = validator.getGreetingMessage("")
        assertEquals("Input tidak boleh kosong!", result)
    }
}