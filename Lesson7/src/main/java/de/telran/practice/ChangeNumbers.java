package de.telran.practice;

// Напишите программу на Java для того,
// чтобы поменять местами значения,
// хранящиеся в двух переменных с помощью третьей переменной:
//На вход: а = 2; b = 5;
//На выход: a = 5; b = 2;
//Используйте переменную temp;

public class ChangeNumbers {
    public static void main(String[] args) {
        changeWithTemp(10, 25);
        changeWithOutTemp(10, 25);
    }

    static void changeWithTemp(int arg1, int arg2) {
        System.out.println("До: arg1 = "+arg1+" arg2 ="+arg2);
        int tempArg = arg1;
        arg1 = arg2;
        arg2 = tempArg;
        System.out.println("После обмена: arg1 = "+arg1+" arg2 = "+arg2);
    }

    // второй метод обмена местами чисел
    static void changeWithOutTemp(int arg1, int arg2) {
        System.out.println("До: arg1 = "+arg1+" arg2 ="+arg2);
        arg1 = arg1 + arg2;
        arg2 = arg1 - arg2;
        arg1 = arg1 - arg2;
        System.out.println("После обмена: arg1 = "+arg1+" arg2 = "+arg2);
    }
}
