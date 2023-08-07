package de.telran.practice3;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        String needNextCalculation;

        do {
            System.out.println("Введите значение второго аргумента (разделитель целой и дробной части - точка):");
            double argumentOne = scanner.nextDouble();

            char sign;
            do {
                System.out.println("Введите знак математической операции (+, -, *, /, %):");
                String signString = scanner.next();
                sign = signString.charAt(0);
            } while (sign != '+' && sign != '-' && sign != '*' && sign != '/' && sign != '%');

            double argumentTwo;
            do {
                System.out.println("Введите значение второго аргумента (разделитель целой и дробной части - точка):");
                argumentTwo = scanner.nextDouble();
            } while (argumentTwo == 0 && (sign == '/' || sign == '%'));


            double result = 0;

            switch (sign) {
                case '+':
                    result = argumentOne + argumentTwo;
                    break;
                case '-':
                    result = argumentOne - argumentTwo;
                    break;
                case '*':
                    result = argumentOne * argumentTwo;
                    break;
                case '/':
                    result = argumentOne / argumentTwo;
                    break;
                case '%':
                    result = argumentOne % argumentTwo;
                    break;
            }
            System.out.println(String.format("%.2f %s %.2f = %.2f ",
                    argumentOne, sign, argumentTwo, result));
            do {
                System.out.println("Выполнить еще вычисление? (Y/N):");
                needNextCalculation = scanner.next();
            } while (!"y".equalsIgnoreCase(needNextCalculation) &&
                     !"n".equalsIgnoreCase(needNextCalculation));
        } while ("y".equalsIgnoreCase(needNextCalculation));
    }
}


/*
1. Используйте операторы цикла для:
Реализации интерактивного меню. После завершения вычислений
калькулятор должен спрашивать желает ли пользователь выполнить
еще вычисление. Если пользователь вводит "Y", то калькулятор
выполняет новый цикл работы - запрашивает значения аргументов
и знак математической операции, выполняет вычисления и выводит
на экран ответ. После этого снова спрашивает желает ли
пользователь выполнить еще вычисление. Если пользователь вводит "N",
то работа программы завершается.

2. Ввода корректного значения выбора пользователя в интерактивном
меню - "Y" или "N". Если пользователь ввёл иной символ -
программа должна попросить ввести ответ снова, до тех под,
пока пользователь не введет символ "Y" или "N".

3. Ввода корректного значения второго аргумента (знаменателя),
если пользователь выбрал знак деления. Если пользователь
выбрал операцию деления и ввёл значение второго аргумента = 0,
то программа должна запрашивать ввод нового значения аргумента
до тех пор, пока оно не будет не равно нулю.

4. Аналогично программа должна повторно запрашивать ввод знака
математической операции до тех пор, пока он не будет введён
корректно.
*/