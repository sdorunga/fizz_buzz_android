package com.example.stefandorunga.myapplication;

/**
 * Created by stefandorunga on 27/03/2016.
 */
public class FizzBuzz {
    public String messageFor(Integer number) {
        if (isDivisibleBy(number, 15)) {
            return "FizzBuzz";
        } else if (isDivisibleBy(number, 3)) {
            return "Fizz";
        } else if (isDivisibleBy(number, 5)) {
            return "Buzz";
        } else {
            return number.toString();
        }
    }

    private boolean isDivisibleBy(Integer number, Integer divisor) {
        return number % divisor == 0;
    }
}
