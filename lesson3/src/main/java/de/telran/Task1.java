package de.telran;

public class Task1 {
    static int myValueClass = 3;
    public static void main(String[] args) {
        int myInt2 = 2;
        our();
        System.out.println(myInt2);
        System.out.println(myValueClass+1);

        Test myTest = new Test();
        myTest.run();
    }
    static void our() {
        int myInt = 1;
        System.out.println("I method our()");
        System.out.println(myInt);
        System.out.println(myValueClass+2);
    }
}
