package de.telran;

import java.util.Random;

public class NestedIfOperations {
    public static void main(String[] args) {
        Random random = new Random(); // генерация числа

        // присвоение пременной
        // скорость авто
        int number = random.nextInt(200); // итервал до 200

        System.out.println("Число сгенерированное: " + number);

        // вложенные условия
        // будут выведены все отработанные строки
        if (number > 100) {
            System.out.println("Привышение скорости, нарушение правил!");
            if (number > 130) {
                System.out.println("Штраф!");
                if (number > 170) System.out.println("Лишение прав!");
            }
        }

        System.out.println(""); // разделительная строка


        // использование логических операторов для диапазона

        // будет выведена одна строка, выводится только то, что отработает
        if (number > 100 && number < 130) System.out.println("Привышение скорости, нарушение правил!");
        if (number > 130 && number < 170) System.out.println("Штраф!");
        if (number > 170) System.out.println("Лишение прав!");
    }
}
