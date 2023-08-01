package de.telran;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LinerSearch {
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

        // Ищем информацию по search1
        System.out.println("Введите значение для поиска по search1: ");
        int key = scanner.nextInt();

        int index = search1(arr, key);
        if (index >= 0) System.out.println("Нашли элимент с Index = " + index);
        else System.out.println("Элимент не найден");

        // Ищем информацию по search2
        System.out.println("Введите значение для поиска по search2: ");
        int key2 = scanner.nextInt();

        int index2 = search2(arr, key2);
        if (index2 >= 0) System.out.println("Нашли элимент с Index = " + index2);
        else System.out.println("Элимент не найден");

        //Ищем информацию используя библиотечный поиск Arrays.binarySearch()
        System.out.println("Введите значение для поиска Arrays.binarySearch(): ");
        int key3 = scanner.nextInt();

        int index3 = Arrays.binarySearch(arr, key3);
        if (index3 >= 0) System.out.println("Нашли элимент с Index = " + index3);
        else System.out.println("Элимент не найден");

        //Ищем все вхождения используя библиотечный поиск Arrays.binarySearch()
        System.out.println("Введите значение для поиска searchArray: ");
        int key4 = scanner.nextInt();

        int[] searchArr = searchAll(arr, key4);
        if (searchArr != null) System.out.println("Нашли элимент с Index = " + Arrays.toString(searchArr));
        else System.out.println("Элимент не найден");
    }


    static int search1(int[] searchArr, int key) {
        int i;
        for (i = 0; i < searchArr.length; i++) {
            if (searchArr[i] == key) break;
        }
        return (i == searchArr.length) ? -1 : i;
    }

    static int search2(int[] searchArr, int key) {
        for (int i = 0; i < searchArr.length; i++) {
            if (searchArr[i] == key) return i;
        }
        return -1;
    }

    static int search3(int[] searchArr, int key) {
        for (int i = searchArr.length - 1; i >= 0; i--) {
            if (searchArr[i] == key) return i;
        }
        return -1;
    }

    static int[] searchAll(int[] searchArr, int key) {
        int[] findInd = null;
        for (int i = searchArr.length - 1; i >= 0; i--) {
            if (searchArr[i] == key) {
                if (findInd == null) {
                    findInd = new int[1];
                    findInd[0] = i;
                } else {
                    findInd = Arrays.copyOf(findInd, findInd.length+1);
                    findInd[findInd.length-1] = i;
                }
            }
        }
        return findInd;
    }
}
