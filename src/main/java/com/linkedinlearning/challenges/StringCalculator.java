package com.linkedinlearning.challenges;

public class StringCalculator {

    public static void main(String[] args) {
        System.out.println(add("42,8"));
    }

    public static int add(String numbers) {
        int sum = 0;

        String[] newNumbers = numbers.split(",");

        if (numbers == "") {
            return 0;
        } else {
            for (String number : newNumbers) {
                sum += Integer.parseInt(number);
            }
        }

        return sum;
    }
}
