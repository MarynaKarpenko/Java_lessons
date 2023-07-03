package de.telran.practice;

// Напишите класс Converter для конвертации из градусов
// по Цельсию в Кельвины​, ​Фаренгейты:
//У класса должны быть методы для конвертации.
//Реализуйте два метода в классе:
//runKelvinConverter(double baseValue)
//runFahrenheitConverter(double baseValue)

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        // ввести градусы цельсия
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в Celsius: ");
        int temNumber = scanner.nextInt();
        System.out.println("Температура в Кельвинах: "+runKelvinConverter(temNumber));
        System.out.println("Температура в Фарингейте: "+runFahrenheitConverter(temNumber));
    }

    // метод конвертации в Kelvin
    static double runKelvinConverter(double baseValue) {
        return baseValue + 273;
    }

    // метод конвертации в Fahrenheit
    static double runFahrenheitConverter(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}
