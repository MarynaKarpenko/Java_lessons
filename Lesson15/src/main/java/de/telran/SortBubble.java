package de.telran;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortBubble {
    public static void main(String[] args) {
        int size = 6;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        size = scanner.nextInt();

        int[] arr = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr)); // Arrays.toString(arr) вывести содержимое массива

        // Библиотечная сортировка
//        Arrays.sort(arr);
//        System.out.println("Sort: " + Arrays.toString(arr));

        // Метод сортировки пузырьком
        sortBubble(arr);
        System.out.println("Sort Bubble: " + Arrays.toString(arr));

        sortBubbleDesc(arr);
        System.out.println("Sort Bubble Desc: " + Arrays.toString(arr));
    }

    static void sortBubble(int[] sortArr) {
        boolean isChange = true;
        int size = sortArr.length-1;
        while (isChange) {
            isChange = false;
            for (int i = 0; i < size; i++) {
                if (sortArr[i] > sortArr[i+1]) {
                    isChange = true;
                    int temp = sortArr[i];
                    sortArr[i] = sortArr[i+1];
                    sortArr[i+1] = temp;
                }
            }
            size--;
        }
    }
    static void sortBubbleDesc(int[] sortArr) {
        boolean isChange = true;
        int size = sortArr.length - 1;
        while (isChange) {
            isChange = false;
            for (int i = 0; i < size; i++) {
                if (sortArr[i] < sortArr[i + 1]) {
                    isChange = true;
                    int temp = sortArr[i];
                    sortArr[i] = sortArr[i + 1];
                    sortArr[i + 1] = temp;
                }
            }
            size--;
        }
    }
}
