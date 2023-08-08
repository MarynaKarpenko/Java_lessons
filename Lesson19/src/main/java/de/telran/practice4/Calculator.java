package de.telran.practice4;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {

    public static final char PLUS_SIGN = '+';
    public static final char MINUS_SIGN = '-';
    public static final char MULTIPLICATION_SIGN = '*';
    public static final char DIVISION_SIGN = '/';
    public static final char REMAINDER_SIGN = '%';
    public static final String YES = "y";
    public static final String NO = "n";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        String needNextCalculation;

        do {
            int argumentsNumber;
            do {
            System.out.print("Введите количество аргументов (2 или блдее): ");
                argumentsNumber = scanner.nextInt();
            } while (argumentsNumber < 2);
            double[] arguments = new double[argumentsNumber];
            for (int i = 0; i < arguments.length; i++) {
                System.out.print(String.format("Введите значение %d аргумента " +
                        "(разделитель целой и дробной части - точка): ", i+1));
                arguments[i] = scanner.nextDouble();
            }

            char sign;
            do {
                System.out.print("Введите знак математической операции (+, -, *, /, %): ");
                String signString = scanner.next();
                sign = signString.charAt(0);
            } while (sign != PLUS_SIGN && sign != MINUS_SIGN && sign != MULTIPLICATION_SIGN &&
                    sign != DIVISION_SIGN && sign != REMAINDER_SIGN);

//            double argumentTwo;
//            do {
//                System.out.println("Введите значение второго аргумента (разделитель целой и дробной части - точка):");
//                argumentTwo = scanner.nextDouble();
//            } while (argumentTwo == 0 && (sign == DIVISION_SIGN || sign == REMAINDER_SIGN));

            double result = arguments[0];
            for (int i = 1; i < arguments.length; i++) {
                switch (sign) {
                    case PLUS_SIGN:
                        result = result + arguments[i];
                        break;
                    case MINUS_SIGN:
                        result = result - arguments[i];
                        break;
                    case MULTIPLICATION_SIGN:
                        result = result * arguments[i];
                        break;
                    case DIVISION_SIGN:
                        result = result / arguments[i];
                        break;
                    case REMAINDER_SIGN:
                        result = result % arguments[i];
                }
            }
            StringBuilder resultMessage = new StringBuilder();
            for (int i = 0; i < arguments.length; i++) {
                resultMessage.append(String.format(" %.2f", arguments[i]));
                if (i < arguments.length - 1) resultMessage.append(sign);
            }
            resultMessage.append(" = ").append(String.format("%.2f ", result));

            System.out.println(resultMessage);

            do {
                System.out.println("Выполнить еще вычисление? (Y/N):");
                needNextCalculation = scanner.next();
            } while (!YES.equalsIgnoreCase(needNextCalculation) &&
                     !NO.equalsIgnoreCase(needNextCalculation));
        } while (YES.equalsIgnoreCase(needNextCalculation));
    }
}


/*
Обновите "Калькулятор" до версии 2,
Обновите функционал до производящего вычисления (+, -, *, /) с произвольным количеством чисел c дробной частью.
Количество аргументов пользователь вводит с клавиатуры. Оно должно быть от 2 и более.
Тип данных вводимых аргументов должен быть Double.
Далее пользователь последовательно вводит значение каждого из аргументов,
а затем - знак математической операции, которую необходимо выполнить со значениями введенных аргументов.
Результат работы программы необходимо вывести в виде вычисляемого выражения и
полученного результата с точностью до двух чисел после запятой

*/