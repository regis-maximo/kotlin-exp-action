package com.example.kotlinaction

import com.example.kotlinaction.chaptersix.MyServiceFoo
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    lateinit var myServiceFoo: MyServiceFoo

    @Before
    fun setup() {
        myServiceFoo = MyServiceFoo()
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testAction() {
        assertEquals("foo", myServiceFoo.performAction())
    }
}