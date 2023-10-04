package com.linkedinlearning.challenges;

public class FizzBuzz {

    public static String counter(int length) {
        String neu = "";
        String newline = System.lineSeparator();

        for (int i = 0; i < length + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i > 1) {
                neu += "FizzBuzz" + newline;
            } else if (i % 5 == 0 && i > 1) {
                neu += "Buzz" + newline;
            } else if (i % 3 == 0 && i > 1) {
                neu += "Fizz" + newline;
            } else if (i != 0) {
                neu += i + newline;
            }
        }

        for (int i = 0; i < length; i++) {

        }
        return neu;
    }
}
