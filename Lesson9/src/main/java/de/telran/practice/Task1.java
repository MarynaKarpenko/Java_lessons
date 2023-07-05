package de.telran.practice;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        double x = random.nextInt();
        double y = random.nextInt();
        System.out.println("Сгенерированное число x: " + x);
        System.out.println("Сгенерированное число y: " + y);

        if (x > 30 && x < 50 && x != 5) {
            System.out.println ("number from 30 to 50, and not equal to 5");
        }

        if (x < 10 || x > 40) {
            System.out.println ("number is or less than 10 or greater than 40");
        }

        if (y == 5.5 || y == 10 || y == 8.3) {
            System.out.println ("number is or 5.5 or 10 or 8.3");
        }

        if (y == 5.5 && y == 10) {
            System.out.println ("Is there something wrong?");
        }

    }
}
