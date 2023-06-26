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
        System.out.println(myTest.myIntTest+" - "+Test.myIntStatic);
        Test.myIntStatic = 999;
        Test myTest1 = new Test();
        myTest1.myIntTest = 88;
        System.out.println(myTest1.myIntTest+" - "+Test.myIntStatic);
        Test myTest2 = new Test();
        myTest2.myIntTest = 99;
        System.out.println(myTest2.myIntTest+" - "+Test.myIntStatic);
    }
    static void our() {
        int myInt = 1;
        System.out.println("I method our()");
        System.out.println(myInt);
        System.out.println(myValueClass+2);
    }
}
