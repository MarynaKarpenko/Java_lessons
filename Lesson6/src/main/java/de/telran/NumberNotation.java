package de.telran;

import java.util.Scanner;

public class NumberNotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number; // вводимое число
        int nsNumbOut; //номер системы счисления в которую нужно преобразовать число
        int nsNumbIn; //номер системы в которой входящее число

        System.out.print("Введите систему счисления вводимого числа = ");
        String strIn = sc.nextLine();
        nsNumbIn = Integer.parseInt(strIn);
        System.out.print("Введите число: ");
        number = Long.parseLong(sc.nextLine(), nsNumbIn);
        System.out.print("В какую систему счисления преобразовать число? -> ");
        nsNumbOut = sc.nextInt();
        System.out.println("Преобразованное число = " + Long.toString(number, nsNumbOut));
    }
}
