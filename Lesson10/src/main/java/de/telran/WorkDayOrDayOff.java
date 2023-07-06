package de.telran;

import java.util.Scanner;

public class WorkDayOrDayOff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String outNameDay = "";                                 // объявили переменную
        outNameDay = getNameDayOfWeekSwitchCase(scanner.nextInt()); // использование переменной
        System.out.println("Day status: " + outNameDay);
    }


    // метод Switch

    static String getNameDayOfWeekSwitchCase(int dayOfWeek) {

        // проверка числа на  диапазон от 1...7

        if (dayOfWeek <= 0 || dayOfWeek > 7) {
            System.out.println("Invalid input number! - " + dayOfWeek);
            return "The day of the week must be from 1 ... 7";
        }

        // анализ на рабочий день или выходной

        String nameDayOfWeek = "";
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                nameDayOfWeek = "working day"; // аналог if (dayOfWeek == 1 || dayOfWeek == 2
                                               // || dayOfWeek == 3 || dayOfWeek == 4 || dayOfWeek == 5)
                break;
            case 6:
            case 7:
                nameDayOfWeek = "day off";  // аналог if (dayOfWeek == 6 || dayOfWeek == 7)
                break;
            default: nameDayOfWeek = "Не корректное число"; // default - используется, если ни одно условие не будет выполнено
        }
        return nameDayOfWeek;
    }
}
