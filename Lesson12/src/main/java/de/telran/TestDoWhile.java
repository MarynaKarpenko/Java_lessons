package de.telran;

public class TestDoWhile {
    public static void main(String[] args) {
        System.out.println();
        runHelloWhile();
        runHelloDoWhile();
        sum();
    }
    static void runHelloWhile() {
        int count = 10;
        while (count > 0) {
            System.out.println("Привет програмист - " + count);
            count--;
        }
    }
    static  void runHelloDoWhile () {
        int count = 10;
        do {
            System.out.println("Привет програмист - " + count);
            count--;
        } while (count > 10);
    }
    static void sum () {
        int x = 10;
        int sum = 0;
        do {
            sum +=x;
            x--;
        } while (x > 0); // 10+9+8+...+1 = 55
        System.out.println("Sum: "+sum);
    }
}
