package de.telran;

public class Utils {
    public static int[] getNumbers() {
        int[] arr = {1, 2, 3};
        return arr;
    }

    public static int findMax(int [] arr) {
        if (arr == null || arr.length == 0)
        return 0;

        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > max) max = val;
        }
        return max;
    }
}
