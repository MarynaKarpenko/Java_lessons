package de.telran.practice1;

import java.util.Locale;
import java.util.Scanner;

// Напишите программу "Калькулятор",
// производящую вычисления с двумя числами c дробной частью.
// Тип данных вводимых аргументов должен быть Double.
// Пользователь должен ввести с клавиатуры знак выполняемой
// математической операции в формате строки, а затем программа
// должна преобразовать введенную строку в значение переменной
// типа Char (получить из строки первый символ методом string.charAt(0);).
// Требуется произвести проверку введенных данных:
// Если пользователь ввёл знак операции, отличный от +, -, *, / -
// выводить сообщение о том, что указанная операция не поддерживается программой.
// Если пользователь хочет выполнить операцию деления и в качестве
// значения второго аргумента ввёл значение 0, то программа должна
// вывести сообщение о том, что на 0 делить нельзя.
// В обеих ситуациях программа должна прекращать дальнейшую работу.
// Результат вычислений необходимо вывести с точностью до двух чисел
// после запятой в формате <значение переменной argumentOne>
// <знак математической операции> <значение переменной argumentTwo> =
// <значение переменной результата>.

// Введите значение первого аргумента (разделитель целой и
// дробной части - точка): 4.7
// Введите знак математической операции (+, -, *, /):
// Введите значение второго аргумента (разделитель целой и
// дробной части - точка): 2
// 14,70 / 2,00 = 7,35
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Введите значение второго аргумента (разделитель целой и дробной части - точка):");
        double argumentOne = scanner.nextDouble();

        System.out.println("Введите знак математической операции (+, -, *, /):");
        String signString = scanner.next();
        char signChar = signString.charAt(0);
        if (signChar != '+' && signChar != '-' && signChar != '*' && signChar != '/') {
            System.out.println(signChar + " указанная операция не поддерживается программой");
            System.exit(0); //return;
        }

        System.out.println("Введите значение второго аргумента (разделитель целой и дробной части - точка):");
        double argumentTwo = scanner.nextDouble();
        if (argumentTwo == 0 && signChar == '/') {
            System.out.println("На 0 делить нельзя");
            System.exit(0);
        }

        double result = 0;

        if (signChar == '+') {
            result = argumentOne + argumentTwo;
        } else if (signChar == '-') {
            result = argumentOne - argumentTwo;
        } else if (signChar == '*') {
            result = argumentOne * argumentTwo;
        } else if (signChar == '/') {
            result = argumentOne / argumentTwo;
        }
        System.out.println(String.format("%.2f %s %.2f = %.2f " ,
                           argumentOne, signChar, argumentTwo, result));
    }
}
