package de.telran.practice3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;


public class UtilsTest {
    @Test
    public void testCompareWinnerNumbers() {
        int[] lotteryNumbers = {1, 5, 3, 10, 33};
        int[] userNumbers1 = {35, 1, 49, 40, 5};
        int[] userNumbers2 = {1, 2, 34, 45, 43};
        int[] userNumbers3 = {4, 23, 12, 45, 7};

        int expected1 = 2;
        int expected2 = 1;
        int expected3 = 0;

        int actual1 = Utils.compareWinnerNumbers(lotteryNumbers, userNumbers1);
        int actual2 = Utils.compareWinnerNumbers(lotteryNumbers, userNumbers2);
        int actual3 = Utils.compareWinnerNumbers(lotteryNumbers, userNumbers3);

        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
        Assertions.assertEquals(expected3, actual3);
    }
}