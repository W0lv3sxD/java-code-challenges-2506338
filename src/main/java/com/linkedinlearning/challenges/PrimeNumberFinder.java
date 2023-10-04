package com.linkedinlearning.challenges;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFinder {

    public static List<Integer> findPrimeNumbersInInterval(int start, int end) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        if (start < 2) {
            start = 2;
        }

        boolean[] isComposite = new boolean[end + 1];
        
        for (int i = 2; i <= Math.sqrt(end); i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j <= end; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        for (int i = start; i <= end; i++) {
            if (!isComposite[i]) {
                list.add(i);
            }
        }
        
        return list;
    }
}
