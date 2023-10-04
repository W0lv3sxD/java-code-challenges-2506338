package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @Test
    void testFibonacci() {
        var expected = 1;
        var actual = Fibonacci.fibonacci(1);
        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
}
