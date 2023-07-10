package de.telran;

import java.util.Scanner;

public class TestFor {
    public static void main(String[] args) {
        printWord(5);

        printNumberWithCount(5634, 4);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number ");
        printNumber(scanner.nextInt());
    }

    static void printNumber(int number) { // 345
        for (;;) {                       // вечный цикл for(int i = 0; i >= 0; i++)
            System.out.println(number % 10);
            number = number / 10;
            if (number == 0) break;
        }
    }

    static void printNumberWithCount(int number, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(number % 10);
            number = number / 10;
        }
    }


    static void printWord(int count) {
        for(int i = 0; i < count; i++) { // 5 < 5 ложь, выходим из цикла
            System.out.println("Hello Word! "+i);
        }
    }
}
