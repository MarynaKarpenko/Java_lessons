package de.telran;

public class Test {
    static int myIntStatic;
    public int myIntTest;
    public Test() {
        System.out.println("started Test");
        myIntTest = 1;
    }

//    public Test(int myIntTest) {
//        this.myIntTest = myIntTest;
//    }

    public Test(int myIntTest) {
        System.out.println("Started Test(int myInt)");
        this.myIntTest =myIntTest;
        this.run();
    }

    public void run() {
        myIntTest = myIntTest + 2;
        this.myIntTest = this.myIntTest + 2;
        System.out.println("started Constructor Test ()");
    }
}
