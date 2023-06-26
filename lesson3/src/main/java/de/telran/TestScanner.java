package de.telran;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        int myInt;
        // целое число
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Input number = ");
        myInt = myScanner.nextInt();
        System.out.println("Output number = "+myInt);

        // строка
        Scanner myScannerString = new Scanner(System.in);
        String myString;
        System.out.print("Input string = ");
        myString = myScannerString.nextLine();
        System.out.println("Output string = "+myString);

        // boolean
        Scanner myScannerBoolean = new Scanner(System.in);
        String myBool;
        System.out.print("Input boolean = ");
        myBool = myScannerBoolean.nextLine();
        System.out.println("Output boolean = "+myBool);

        // long
        Scanner myScannerLong = new Scanner(System.in);
        long myLong;
        System.out.print("Input long = ");
        myLong = myScannerLong.nextLong();
        System.out.println("Output long = "+myLong);

        // double
        Scanner myScannerDouble = new Scanner(System.in);
        String myDouble;
        System.out.print("Input double format(XX,X)= ");
        myDouble = myScannerDouble.nextLine();
        System.out.println("Output double = "+myDouble);
    }
}
