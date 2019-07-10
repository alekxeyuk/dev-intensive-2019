package com.example.devintensive

import com.example.devintensive.extensions.TimeUnits
import com.example.devintensive.extensions.add
import com.example.devintensive.extensions.format
import com.example.devintensive.models.User
import org.junit.Test

import org.junit.Assert.*
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun test_instance() {
        val user = User("1")
    }

    @Test
    fun test_factory() {
        val user = User("0", "John", "Doe")
        user.lastVisit = Date().add(365, TimeUnits.DAY)

        println(user.lastVisit?.format())
    }
}
