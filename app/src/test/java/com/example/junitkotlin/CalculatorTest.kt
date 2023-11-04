package com.example.junitkotlin

import org.junit.Test

class CalculatorTest {
    val calculator = Calculator();

    @Test
    fun testAddSuccess() {
        val result = calculator.add(10,10);
    }
}