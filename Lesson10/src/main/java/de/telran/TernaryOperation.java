package de.telran;

import java.util.Scanner;

public class TernaryOperation {
    public static void main(String[] args) {

        int start1, end1, start2, end2, currentTime = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Start of work of 1 store: ");
        start1 = scanner.nextInt(24);

        System.out.print("Closing of 1 store: ");
        end1 = scanner.nextInt(24);

        System.out.print("\nStart of work of 2 store: ");
        start2 = scanner.nextInt(24);

        System.out.print("Closing of 2 store: ");
        end2 = scanner.nextInt(24);

        System.out.print("\nEnter the current time: ");
        currentTime = scanner.nextInt(24);

        workingStore1(start1, end1, currentTime);
        workingStore2(start2, end2, currentTime);

    }

    static void workingStore1(int start, int end, int currentTime) {
        String outMessage;
        if (currentTime >= start && currentTime <= end)
            outMessage = "Store 1 is OPEN";
        else outMessage = "Store 1 is CLOSED";
        System.out.println(outMessage);
    }

    // тернарный оператор

    static void workingStore2(int start, int end, int currentTime) {
        String outMessage = (currentTime >= start && currentTime <= end) ? "Store 2 is OPEN" : "Store 2 is CLOSED";
        // (currentTime >= start && currentTime <= end) - условие
        // "Store 2 is OPEN" - значение, то что выполняется
        // "Store 2 is CLOSED" - значение, то что не выполняется
        System.out.println(outMessage);
    }
}
