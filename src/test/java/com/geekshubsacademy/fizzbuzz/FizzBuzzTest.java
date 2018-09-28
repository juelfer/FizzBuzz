package com.geekshubsacademy.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FizzBuzzTest {

    @Test
    public void firstTest()
    {
        assertTrue (true);
    }

    @Test
    public void itShouldReturnFizzIfDivisibleByThree()
    {
        //Arrange
        FizzBuzz fizzbuzz = new FizzBuzz();
        int value = 3;

        //Act
        boolean result = fizzbuzz.isFizz(value);

        //Assertion
        assertTrue(result);
    }
}
