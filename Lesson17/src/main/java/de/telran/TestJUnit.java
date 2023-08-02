package de.telran;

import sun.management.counter.Units;

import java.util.Arrays;

public class TestJUnit {
    public static void main(String[] args) {
        int[] arr = Utils.getNumbers();
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
        System.out.println("Max: " + Utils.findMax(arr));
//        System.out.println(arr[4]);

//        int[] arr1 = {};
//        System.out.println(arr1.length);
    }
}
