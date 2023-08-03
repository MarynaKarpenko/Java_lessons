package de.telran.practice1;

import com.sun.xml.internal.stream.Entity;

import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int setSize = 5; // количесво номеров в игре
        int range = 50;  // интервал генерации номеров
        int lucky;      // генерация счастлиыого числа
        int luckyCount; // ушаданое количество чисел

        // сгенерируемые номера лотереи
        int lucky1 = 0;
        int lucky2 = 0;
        int lucky3 = 0;
        int lucky4 = 0;
        int lucky5 = 0;

        // номера введенные пользователем
        int userNum1;
        int userNum2;
        int userNum3;
        int userNum4;
        int userNum5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер от 1 до " + range);
        do {
            System.out.print("Введите 1-й номер: ");
            userNum1 = scanner.nextInt();
        } while (userNum1 <= 0 || userNum1 > 50);

        System.out.print("Введите 2-й номер: ");
        userNum2 = scanner.nextInt();

        System.out.print("Введите 3-й номер: ");
        userNum3 = scanner.nextInt();

        System.out.print("Введите 4-й номер: ");
        userNum4 = scanner.nextInt();

        System.out.print("Введите 5-й номер: ");
        userNum5 = scanner.nextInt();


        luckyCount = 1;
        Random random = new Random();

        for (int i = 0; i < setSize; i++) {

            lucky = random.nextInt(range);

            if (luckyCount == 1) {
                lucky1 = lucky;
                luckyCount++;
            } else
            if (luckyCount == 2) {
                lucky2 = lucky;
                luckyCount++;
            } else
            if (luckyCount == 3) {
                lucky3 = lucky;
                luckyCount++;
            } else
            if (luckyCount == 4) {
                lucky4 = lucky;
                luckyCount++;
            } else
            if (luckyCount == 5) {
                lucky5 = lucky;
                luckyCount++;
            }
        }
        System.out.println("Выигрышные номера: " + lucky1 + ", " + lucky2 +
                ", " + lucky3 + ", "  + lucky4 + ", "  + lucky5);
        System.out.println("Номера пользователя: " + userNum1 + ", " + userNum2 + ", " + userNum3 +
                ", "  + userNum4 + ", "  + userNum5);
    }
}
