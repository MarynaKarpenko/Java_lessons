package de.telran;

import java.util.Random;

public class IfElseIfOperations {
    public static void main(String[] args) {
        Random random = new Random();
        float number = random.nextFloat() + random.nextInt(10);
        System.out.println("Сгенерированное второе число: " + number);

        System.out.println(""); // разделительная строка

        if (number < 2) System.out.println("Начался не большой дождик");
        if (number >= 2 && number < 5) System.out.println("Сильный дождь");
        if (number >= 5 && number < 7) System.out.println("На улице ливень");
        if (number >= 7) System.out.println("Штормовое предупреждение! Потоп!");

        System.out.println(""); // разделительная строка

        // второй вариант кода (альтернатива)
        // выполняется по методу исключения, во вложенном операторе выполняется все до момента завершения условия
        if (number < 2) {
            System.out.println("Начался не большой дождик");
        } else if (number < 5) {
            System.out.println("Сильный дождь");
        } else if (number < 7) {
            System.out.println("На улице ливень");
        } else {
            System.out.println("Штормовое предупреждение! Потоп!");
        }
    }
}
