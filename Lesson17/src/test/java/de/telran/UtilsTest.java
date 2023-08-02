package de.telran;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    int[] expArr = {1,2,3};
    int[] testArr;
    @BeforeEach
    void init() {
    testArr = Utils.getNumbers();
    }
    @Test
    void getNumbersTestElement() {
        int[] expArr = {1,2,3};
        int[] testArr = Utils.getNumbers();

        assertEquals(2, testArr[1]);
    }

    @Test
    void getNumbersTestEquals() {
        int[] expArr = {1,2,3};
        int[] testArr = Utils.getNumbers();

        assertArrayEquals(expArr, testArr);
        assertEquals(3, testArr.length);
    }
    @Test
    void findMaxArrayEmpty() {
        int[] testArray = {};
        assertEquals(0, Utils.findMax(testArray));
    }

    @Test
    void findMaxArrayTrueResult() {
        int[] testArray = {1,9,3,8,-1};
        assertEquals(9, Utils.findMax(testArray));
    }
}