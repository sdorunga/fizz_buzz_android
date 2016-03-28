package com.example.stefandorunga.myapplication;

/**
 * Created by stefandorunga on 27/03/2016.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void correctMessageForInput() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1",fizzBuzz.messageFor(1));
        assertEquals("2",fizzBuzz.messageFor(2));
        assertEquals("Fizz",fizzBuzz.messageFor(3));
        assertEquals("4",fizzBuzz.messageFor(4));
        assertEquals("Buzz",fizzBuzz.messageFor(5));
        assertEquals("Fizz",fizzBuzz.messageFor(6));
        assertEquals("7",fizzBuzz.messageFor(7));
        assertEquals("8",fizzBuzz.messageFor(8));
        assertEquals("Fizz",fizzBuzz.messageFor(9));
        assertEquals("Buzz",fizzBuzz.messageFor(10));
        assertEquals("11",fizzBuzz.messageFor(11));
        assertEquals("Fizz",fizzBuzz.messageFor(12));
        assertEquals("13",fizzBuzz.messageFor(13));
        assertEquals("14",fizzBuzz.messageFor(14));
        assertEquals("FizzBuzz",fizzBuzz.messageFor(15));
    }
}
