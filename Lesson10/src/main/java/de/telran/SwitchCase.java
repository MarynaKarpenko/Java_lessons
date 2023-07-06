package de.telran;

import java.util.Scanner;

// вызываем число, методом возвращаем название дня недели
public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число дня недели: ");
        String outNameDay = "";                                 // объявили переменную
        outNameDay = getNameDayOfWeekIfElse(scanner.nextInt()); // использование переменной
        System.out.println("Имя дня недели: "+outNameDay);


        // вызов метода Switch

        System.out.print("\nВведите число дня недели: ");           // \n - перенос строки, печать с новой строки
        outNameDay = getNameDayOfWeekSwitchCase(scanner.nextInt()); // использование переменной
        System.out.println("Имя дня недели: "+outNameDay);

    }

    // метод If Else

    static String getNameDayOfWeekIfElse(int dayOfWeek) {
        if (dayOfWeek <= 0 || dayOfWeek > 7) {
            System.out.println("Не корректное входящие число! - " + dayOfWeek);
            return "День недели должен быть от 1 ... 7";
        }
        String nameDayOfWeek = "";
        if (dayOfWeek == 1) nameDayOfWeek = "monday";
        else if (dayOfWeek == 2) nameDayOfWeek = "tuesday";
        else if (dayOfWeek == 3) nameDayOfWeek = "wednesday";
        else if (dayOfWeek == 4) nameDayOfWeek = "thursday";
        else if (dayOfWeek == 5) nameDayOfWeek = "friday";
        else if (dayOfWeek == 6) nameDayOfWeek = "saturday";
        else if (dayOfWeek == 7) nameDayOfWeek = "sunday";
        else nameDayOfWeek = "Не корректное число";

        return nameDayOfWeek;
    }

    // метод Switch

    static String getNameDayOfWeekSwitchCase(int dayOfWeek) {
        if (dayOfWeek <= 0 || dayOfWeek > 7) {
            System.out.println("Не корректное входящие число! - " + dayOfWeek);
            return "День недели должен быть от 1 ... 7";
        }
        String nameDayOfWeek = "";
        switch (dayOfWeek) {
            case 1: {
                nameDayOfWeek = "monday"; // nameDayOfWeek - имя переменной
                break;                    // break - выход, если выполнился участок кода
            }
            case 2: {
                nameDayOfWeek = "tuesday";
                break;
            }
            case 3: {
                nameDayOfWeek = "wednesday";
                break;
            }
            case 4: {
                nameDayOfWeek = "thursday";
                break;
            }
            case 5: {
                nameDayOfWeek = "friday";
                break;
            }
            case 6: {
                nameDayOfWeek = "saturday";
                break;
            }
            case 7: {
                nameDayOfWeek = "sunday";
                break;
            }
            default: nameDayOfWeek = "Не корректное число"; // default - используется, если ни одно условие не будет выполнено
        }
        return nameDayOfWeek;
    }
}
