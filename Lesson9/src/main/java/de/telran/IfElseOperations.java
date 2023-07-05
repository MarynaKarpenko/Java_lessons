package de.telran;

import java.util.Random;

public class IfElseOperations {
    public static void main(String[] args) {
        Random random = new Random(); // генерация числа

        // присвоение пременной
        int number = random.nextInt(200) - 100; // итервал от -100 до 100,

        System.out.println("Число: " + number);

        if (number > 0) {
            System.out.println("Температура в Цельсиях " + (number - 273));
        } else { // выводится при условии не выполнения первого условия, если сгенерированное число будет меньше 0
            System.out.println("Не можем преобразовать число в температуру в Цельсиях");
        }

        System.out.println(""); // разделительная строка

        // альтернатива, второй вариант
        if (number > 0) {
            System.out.println("Температура в Цельсиях " + (number - 273));
        }
        if (number <= 0) {
            System.out.println("Не можем преобразовать число в температуру в Цельсиях");
        }
        if (!(number > 0)) { // аналогично (number<=0)
            System.out.println("Не можем преобразовать число в температуру в Цельсиях");
        }

        System.out.println(""); // разделительная строка

        // если исключить 0 из проверки
        if (number > 0) {
            System.out.println("Температура в Цельсиях " + (number - 273));
        }
        if (number < 0) {
            System.out.println("Не можем преобразовать число в температуру в Цельсиях");
        }
        if (number == 0) {
            System.out.println("Згачение равно 0");
        }
    }
}
