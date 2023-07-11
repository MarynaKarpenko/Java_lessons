package de.telran.practice;

import java.util.Scanner;

public class Lift {
    public static void main(String[] args) {
        int h, n, m;
        Scanner scanner = new Scanner(System.in);
        do {
        System.out.print("Enter the number of floor of the house h: ");
        h = scanner.nextInt();
        System.out.print("Enter lift step n: ");
        n = scanner.nextInt();
        System.out.print("Enter descent step m: ");
        m = scanner.nextInt();
//        h = 200;
//        n = 50;
//        m = 1;
            if (m >= n) System.out.println("Введите корректное значение");
        }
        while (m >= n);

        int currentFloor = 0;
        int i = 0;
        while (currentFloor < h) {
            System.out.println(i + "Current floor: " + currentFloor);
            currentFloor = numberOfLifts(currentFloor, n, m);
            i++;
        }
        System.out.println("You have reached the last floor: " + h + "за количестко иттераций: " + i);
    }
    static int numberOfLifts (int floor, int stepUp, int stepDown) {
        return floor + stepUp - stepDown;
    }
}
