package com.geekshubsacademy.fizzbuzz;

public class FizzBuzz {

    public static final int FIZZ_FACTOR = 3;
    public static final int BUZZ_FACTOR = 5;

    public boolean isFizz(int value)
    {
        return 0 == value% FIZZ_FACTOR;
    }

    public boolean isBuzz(int value)
    {
        return 0 == value% BUZZ_FACTOR;
    }

    public boolean isFizzBuzz(int value)
    {
        return isFizz(value) && isBuzz(value);
    }
}
