package com.linkedinlearning.challenges;

public class Fibonacci {

    public static int fibonacci(int n) {
        int one = 0;
        int two = 1;
        int sum = 0;

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            for (int i = 0; i < n - 1; i++) {
                sum = one + two;
                one = two;
                two = sum;
            }
        }

        return sum;
    }
}