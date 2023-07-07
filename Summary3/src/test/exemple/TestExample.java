package test.exemple;

public class TestExample {
    public static int sum (int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
//    public static void positiveSumTest() {
//        int currentResult = sum(15, 21);
//        int expectedResult =36;
//
//        if (currentResult == expectedResult) System.out.println("test was successful");
//        else System.out.println("test was unsuccessful");
//    }

    public static void asserNumberEquals (int currentNumber, int expectedNumber) {
        if (currentNumber == expectedNumber) System.out.println("This numbers are equal");
        else {
            System.err.println("This number aren't equal \n");
            System.out.println();
            System.err.println("Current: " + currentNumber);
            System.err.println("Expected: " + expectedNumber);
        }
    }
}
