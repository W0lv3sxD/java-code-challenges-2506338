package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.linkedinlearning.solutions.HappyNumbers;

public class HappyNumberTest {
    @Test
    void testIsHappy() {
        Assertions.assertFalse(HappyNumbers.isHappy(2));
        Assertions.assertFalse(HappyNumbers.isHappy(8));

        Assertions.assertTrue(HappyNumbers.isHappy(7));
        Assertions.assertTrue(HappyNumbers.isHappy(10));
        Assertions.assertTrue(HappyNumbers.isHappy(13));
        Assertions.assertTrue(HappyNumbers.isHappy(19));
        Assertions.assertTrue(HappyNumbers.isHappy(23));
        Assertions.assertTrue(HappyNumbers.isHappy(28));
        Assertions.assertTrue(HappyNumbers.isHappy(899));
    }
}
