package de.telran.practice;

import java.util.Scanner;

public class BuildSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту: ");
        int height = scanner.nextInt();
        System.out.println("\nВведите ширину: ");
        int width = scanner.nextInt();
        build(width, height);
    }
    static void build(int width, int height) {
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
