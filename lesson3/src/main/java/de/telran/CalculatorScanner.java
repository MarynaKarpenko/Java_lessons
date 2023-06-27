package de.telran;

import java.util.Scanner;

public class CalculatorScanner {
    public static void main(String[] args) {
        int myInt1;
        Scanner myScanner1 = new Scanner(System.in);
        System.out.print("Input number1 = ");
        myInt1 = myScanner1.nextInt();

        int myInt2;
        Scanner myScanner2 = new Scanner(System.in);
        System.out.print("Input number2 = ");
        myInt2 = myScanner2.nextInt();

        System.out.println("Output sum = "+(myInt1+myInt2));
        System.out.println("Output difference = "+(myInt1-myInt2));
        System.out.println("Output product = "+(myInt1*myInt2));
        System.out.println("Output quotient = "+(myInt1/myInt2));
    }
}
