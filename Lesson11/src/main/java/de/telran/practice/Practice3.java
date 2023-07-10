package de.telran.practice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число ");
        int num2 = scanner.nextInt();
        int maxNum = (num1 > num2) ? num1 : num2;
        System.out.println("Сумма числа от 0 до " + maxNum + " = " + maxNum1Num2(maxNum));
    }
    static int maxNum1Num2(int maxNum) {
        int sum = 0;
        for (int i = 0; i <= maxNum; i++) {
            sum += i;
        }
        return sum;
    }
}
