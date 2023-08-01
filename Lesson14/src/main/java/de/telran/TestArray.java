package de.telran;

import java.util.Arrays;
import java.util.Random;

public class TestArray {
    int elemClass;
    public static void main(String[] args) {
        int[] arrInt; // значение null
        arrInt = new int[10];
        for (int val : arrInt) {
            System.out.println(val);

        }
        System.out.println(arrInt);
        Random random = new Random();
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = random.nextInt(100);
            System.out.println("arrInt["+i+"] = " + arrInt[i]);
        }


        // изменение массива
        arrInt[5] = 333333; // явное изменение
        arrInt[arrInt.length-1] = 99; // изменение последного елемента массива


        for (int val : arrInt) {
            System.out.println(val);
        }


        // ручное увиличение размера нашего массива до 15
        arrInt =copyArray(arrInt, 15);
        for (int val : arrInt) {
            // val - значение елемента массива.
            // : - брать из массива построчно, для каждого елемента
            System.out.println(val);
        }

        // анналогичное увеличение массива до 20
        arrInt = Arrays.copyOf(arrInt,20); // copyOf - копирование
        for (int val : arrInt) {
            System.out.println(val);
        }


        // копирование массива
        int[] newArrInt = Arrays.copyOf(arrInt, arrInt.length); // копирование библиотечным методом
        int[] newArrInt1 = copyArray(arrInt, arrInt.length);  // копирование ручным методом

        System.out.println("-----new Array Int-----");
        for (int val : newArrInt) {
            System.out.println(val);
        }

        System.out.println("--- newArrInt --- ");
        for(int val : newArrInt) System.out.println(val);

        for (int i=0; i<newArrInt.length; i++) newArrInt[i] = -1; //меняем все значения на -1 в копии
        System.out.println("--- newArrInt --- копия");
        for(int val : newArrInt) System.out.println(val);

        System.out.println("-- arrInt -- оригинал");
        for (int val : arrInt) System.out.println(val); //foreach  val - значение элемента массива


        String[] arrString = new String[5];
        for (String val : arrString) {
            System.out.println(val);
        }
        int[] arrIntInit = {88,33,111,4,30,6,7}; // new int[7]
        for (int val : arrIntInit) {
            System.out.println(val);
        }

        // сортировка
        System.out.println("----arrInt----отсортирован");
        Arrays.sort(arrInt);
        for (int val : arrInt) System.out.println(val);
    }
    // метод
    static int[] copyArray(int [] oldArr, int newSize) {
        if (oldArr.length > newSize) {
            return null;
        }
        int[] newArr = new int[newSize];
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
            return newArr;
        }
        return newArr;
    }
}
