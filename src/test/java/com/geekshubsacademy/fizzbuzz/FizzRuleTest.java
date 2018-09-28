package com.geekshubsacademy.fizzbuzz;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class FizzRuleTest {

@DataProvider
public static Object[][] dataNumberProviderForFizz() {
        return new Object[][] {
            {3, true},
            {18, true},
            {27, true},
            {33, true}
            };
        }

    @Test
    @UseDataProvider("dataNumberProviderForFizz")
    public void itShouldReturnFizzIfDivisibleByThree(int value, boolean expected)
    {
        FizzRule fizzRule = new FizzRule;
        boolean result = fizzRule.match(value);
        assertEquals(expected, result);

    }
}
