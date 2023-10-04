package com.linkedinlearning.challenges;

import java.util.Collection;

public class ArithmeticMean {

    public static double mean(Collection<Integer> numbers) {
        double arith = 0;

        for (Integer number : numbers) {
            arith += number;
        }

        return arith / numbers.size();
    }
}
