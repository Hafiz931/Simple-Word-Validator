package com.example.androidunittest

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    // Rule ini akan otomatis membuka MainActivity sebelum setiap test dijalankan
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    /*
     * Instrumental Test 1: Menguji interaksi UI ketika pengguna mengetik nama
     * dan menekan tombol submit.
     */
    @Test
    fun testUserInput_displaysGreetingMessage() {
        onView(withId(R.id.etInput)).perform(typeText("Andi"), closeSoftKeyboard())
        onView(withId(R.id.btnSubmit)).perform(click())
        onView(withId(R.id.tvResult)).check(matches(withText("Halo, Andi!")))
    }

    /*
     * Instrumental Test 2: Menguji interaksi UI ketika pengguna menekan
     * tombol submit tanpa mengetik apapun (input kosong).
     * Aplikasi harus menampilkan peringatan error di TextView.
     */
    @Test
    fun testEmptyInput_displaysErrorMessage() {
        onView(withId(R.id.etInput)).perform(clearText(), closeSoftKeyboard())
        onView(withId(R.id.btnSubmit)).perform(click())

        onView(withId(R.id.tvResult)).check(matches(withText("Input tidak boleh kosong!")))
    }
}