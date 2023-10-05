package com.linkedinlearning.challenges;

public class PalindromeChecker {
    
    public static void main(String[] args) {
        System.out.println(isPalindrome("live on time, emit no evil"));
    }

    public static boolean isPalindrome(String word) {

        String newWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            newWord += word.charAt(i);
        }

        if (newWord.contains(" ,")) {
            newWord = newWord.replaceAll(" ,", ", ");
        }

        if (word.equals(newWord)) {
            return true;
        } else {
            return false;
        }
    }
}
