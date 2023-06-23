package org.telran;

public class Task1 {
    public static void main(String[] args) {
        int myInt = 3;
        int myInt2 = 10;
        System.out.println(myInt);
        System.out.println(myInt2);

        int resultInt = myInt+myInt2;
        System.out.println(resultInt);
        System.out.println(myInt-myInt2);
        System.out.println(myInt*myInt2);
        System.out.println(myInt2/myInt);
        System.out.println(myInt2%myInt);

        double myDouble = 3.0;
        double myDouble2 = 10;
        double resultDouble2 = myDouble2/myDouble;
        System.out.println(resultDouble2);

        double resultDouble = (double)myInt2/myInt;
        System.out.println(resultDouble);

        System.out.println(myDouble2+myInt);


        byte myByte = 66;
        float myFloat = 33.01F;

        System.out.println(myFloat);

        System.out.print("Hello World! ");
        System.out.println("Hello Maryna!");
        System.out.println("Maryna!");
        myInt = 6;
        System.out.println(myInt);

        run();
    }
    static void run() {
        System.out.println("Runner!!!");
    }
}