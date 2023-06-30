package de.telran;

public class Methods {
    public static void main(String[] args) {
        sumConsole(1, 2);
        sumConsole(10,25);

        // 1. вариант вызова метода
        int sum = sumReturnResult(15, 35);
        System.out.println(sum);

        // 2. вариант вызова метода
        System.out.println(sumReturnResult(12,3));

        // 3. вариант вызова метода
        int sumTwoMethods = sumReturnResult(2,6)-sumReturnResult(32,33);
        System.out.println(sumTwoMethods);
    }

    // 1. не возвратный метод
    static void sumConsole(int arg1, int arg2) { // void что-то делает внутри метода и ничего не возвращает
        int sum = arg1+arg2;
        System.out.println("Сумма = "+sum);
    }

    // 2. возвратный метод
    static int sumReturnResult(int arg1, int arg2) {  // метод с int возвращает результат
        int sum = arg1+arg2;
        return sum;  // return писать обязательно
    }
}
