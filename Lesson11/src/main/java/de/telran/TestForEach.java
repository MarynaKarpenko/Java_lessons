package de.telran;

public class TestForEach {
    public static void main(String[] args) {
        int[] arr = {1, 22, 333, 4444, 55555};
        for (int val: arr) {            // val = 1;
            System.out.println(val);
            if (val == 333) break;    // остановка по вызову значения
        }
    }
}
