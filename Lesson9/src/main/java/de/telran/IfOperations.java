package de.telran;

import java.util.Random;

public class IfOperations {
    public static void main(String[] args) {
        Random random = new Random(); // генерация числа

        // сначала выполняется этот участок кода

        int number = random.nextInt(); // присвоение пременной
        System.out.println("Число до проверки: " + number);

        // тернарные операторы

        if (number > 0) { // выполняется только при условии number>0
            number++;
            System.out.println("Число после проверки: " + number);
        }

        if (number == 0) { // ограничение выполнение кода, условием выполнения, брать в {} если больше одного операнда
            --number;
            System.out.println("Если равно 0: " + number);
        }

        if (number < 0) return; // return - выход из выполняемого метода, если условия не соблюдены
            System.out.println("Температура в Цельсиях " + (number - 273) ); // перевод температуры в Цельсий

    }
}
