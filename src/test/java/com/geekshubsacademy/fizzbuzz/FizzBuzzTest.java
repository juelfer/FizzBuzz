package com.geekshubsacademy.fizzbuzz;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(DataProviderRunner.class)
public class FizzBuzzTest {

    @DataProvider
    public static Object[][] dataNumberProviderForFizz() {
        return new Object[][] {
                {3, true},
                {18, true},
                {27, true},
                {33, true}
        };
    }

    @DataProvider
    public static Object[][] dataNumberProviderForBuzz() {
        return new Object[][] {
                {5, true},
                {10, true},
                {25, true},
                {35, true}
        };
    }

    @DataProvider
    public static Object[][] dataNumberProviderForFizzBuzz() {
        return new Object[][] {
                {15, true},
                {30, true},
                {45, true},
                {90, true}
        };
    }

    @Test
    public void firstTest()
    {
        assertTrue (true);
    }

    @Test
    @UseDataProvider("dataNumberProviderForFizz")
    public void itShouldReturnFizzIfDivisibleByThree(final int input, final boolean expected)
    {
        //Arrange
        FizzBuzz fizzbuzz = new FizzBuzz();
        //Act
        boolean result = fizzbuzz.isFizz(input);
        //Assertion
        assertEquals(expected, result);
    }

    @Test
    @UseDataProvider("dataNumberProviderForBuzz")
    public void itShouldReturnBuzzIfDivisibleByFive(final int input, final boolean expected)
    {
        //Arrange
        FizzBuzz fizzbuzz = new FizzBuzz();
        //Act
        boolean result = fizzbuzz.isBuzz(input);
        //Assertion
        assertEquals(expected, result);
    }

    @Test
    @UseDataProvider("dataNumberProviderForFizzBuzz")
    public void itShouldReturnFizzBuzzIfDivisibleByThreeandFive(final int input, final boolean expected)
    {
        //Arrange
        FizzBuzz fizzbuzz = new FizzBuzz();
        //Act
        boolean result = fizzbuzz.isFizzBuzz(input);
        //Assertion
        assertEquals(expected, result);
    }
}
