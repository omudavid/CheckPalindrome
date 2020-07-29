package com.example.noactivity

import org.junit.Test

import org.junit.Assert.*
import org.junit.Ignore

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun test1() {
        assertEquals(true, checkPalindrome("Red rum, sir, is murder"))
    }

    @Test
    fun test2() {
        assertEquals(true, checkPalindrome("Do geese see God?"))
    }

    @Test
    fun test3() {
        assertEquals(true, checkPalindrome("No lemon, no melon"))
    }

    @Test
    fun test4() {
        assertEquals(true, checkPalindrome("Eva, can I see bees in a cave?"))
    }

    @Test
    fun test5() {
        assertEquals(true, checkPalindrome("Egad! Loretta has Adams as mad as a hatter. Old age!"))
    }

    @Test
    fun test6() {
        assertEquals(true, checkPalindrome("Stop! nine myriad murmur.Put up rum, rum, dairymen, in pots."))
    }

    @Test
    fun test7() {
        assertEquals(false, checkPalindrome("I am a decadev"))
    }

    @Test
    fun test8() {
        assertEquals(false, checkPalindrome("Lay a wallaby the baby ball away, Al."))
    }

    @Test
    fun test9() {
        assertEquals(true, checkPalindrome("\"Degenerate Moslem, a cad!\" Eva saved a camel so Meta reneged."))
    }

    @Test
    fun test10() {
        assertEquals(true, checkPalindrome("madam"))
    }

    @Test
    fun test11() {
        assertEquals(false, checkPalindrome(""))
    }
}

