package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void testRenderFizzBuzzUntil() {
        var expected = """
                1
                2
                Fizz
                4
                Buzz
                Fizz
                7
                8
                Fizz
                Buzz
                11
                Fizz
                13
                14
                FizzBuzz
                """;
        var actual = FizzBuzz.counter(15);
        Assertions.assertEquals(expected, actual);
    }
}
