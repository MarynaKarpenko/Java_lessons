package de.telran.practice2;

import java.util.Locale;
import java.util.Scanner;

// Используйте оператор switch-case вместо оператора if-else
// при обработке введенной математической операции.
// К списку арифметическыих операций, выполняемх калькулятором,
// добавьте поддержку операции деления по модулю (%), возвращающую остаток от деления.
public class Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Введите значение второго аргумента (разделитель целой и дробной части - точка):");
        double argumentOne = scanner.nextDouble();

        System.out.println("Введите знак математической операции (+, -, *, /, %):");
        String signString = scanner.next();
        char sign = signString.charAt(0);
        if (sign != '+' && sign != '-' && sign != '*' && sign != '/' && sign != '%') {
            System.out.println(sign + " указанная операция не поддерживается программой");
            System.exit(0); //return;
        }
        System.out.println("Введите значение второго аргумента (разделитель целой и дробной части - точка):");
        double argumentTwo = scanner.nextDouble();
        if (argumentTwo == 0 && sign == '/' && sign == '%') {
            System.out.println("На 0 делить нельзя");
            System.exit(0);
        }

        double result = 0;

        switch (sign) {
            case '+' :
                result = argumentOne + argumentTwo;
                break;
            case '-' :
                result = argumentOne - argumentTwo;
                break;
            case '*' :
                result = argumentOne * argumentTwo;
                break;
            case '/' :
                result = argumentOne / argumentTwo;
                break;
            case '%' :
                result = argumentOne % argumentTwo;
                break;
        }
        System.out.println(String.format("%.2f %s %.2f = %.2f " ,
                argumentOne, sign, argumentTwo, result));
    }
}
