package de.telran;

// унарные операторы работают только над одной переменной

public class UnaryOperators {
    public static void main(String[] args) {
        int val1 = 10, val2 = 20; // присвоение значения в одну строку
        System.out.println("Сумма 2х чисел: " + (val1 + val2)); // бинарная операция,
        // когда используется два операнда

        System.out.println("Постфиксный инкремент числа: " + (val1 ++)); // val1 = val1 + 1; унарная операция инкремента,
        // когда операция выполняется над одной переменной

        System.out.println("Постфиксный декремент числа: " + (val2 --)); // val2 = val2 - 1;

        System.out.println("Префиксный инкремент числа: " + (++val1));  // val1 = val1 + 1;

        System.out.println("Префиксный декремент числа: " + (--val2));  // val2 = val2 - 1;

        val1++;
        System.out.println("Печать постфиксого инкремента числа: " + val1);

        System.out.println("Меняем число на противоположное значение: " + (-val1)); // унарный минус

    }
}
