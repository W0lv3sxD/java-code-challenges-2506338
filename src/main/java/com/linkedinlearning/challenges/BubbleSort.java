package com.linkedinlearning.challenges;

public class BubbleSort {

    // public static void main(String[] args) {
    //     int[] array = sort(new int[] {5, 1, 3, 2, 8});
    //     for (int i : array) {
    //         System.out.println(i);
    //     }
    // }

    public static void sort(int[] array) {
        int temp = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
