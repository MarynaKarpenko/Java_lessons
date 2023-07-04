package de.telran;

// операторы работают только над несколькими переменными
// булевые операторы

public class RelationOperators {
    public static void main(String[] args) {
        int val1 = 10, val2 = 15, val3 = -5, val4 = 10;

        System.out.println(""); //строка разделения
        // оператор == равно
        System.out.println("val1 == val2 " + (val1 == val2)); // операция сравнения
        System.out.println("val1 == val4 " + (val1 == val4)); // операция сравнения одинаковых значений

        System.out.println(""); //строка разделения
        // оператор сравнения != не равно
        System.out.println("val1 != val2 " + (val1 != val2)); // действительно ли не равны между собой
        System.out.println("val1 != val4 " + (val1 != val4)); // 10 != 10 true

        System.out.println(""); //строка разделения
        // оператор >
        System.out.println("val1 > val2 " + (val1 > val2)); // действительно ли val1 > val2
        System.out.println("val1 > val4 " + (val1 > val4)); // 10 > 10 false
        System.out.println("val1 > val3 " + (val1 > val3)); // 10 > -5 true

        System.out.println(""); //строка разделения
        // оператор <
        System.out.println("val1 < val2 " + (val1 < val2)); // действительно ли val1 < val2 10 < 15 true
        System.out.println("val1 < val4 " + (val1 < val4)); // 10 < 10 false
        System.out.println("val1 < val3 " + (val1 < val3)); // 10 < -5 false

        System.out.println(""); //строка разделения
        // оператор >= больше либо равно
        System.out.println("val1 >= val2 " + (val1 >= val2)); // действительно ли val1 >= val2, 10 >= 15 false
        System.out.println("val1 >= val4 " + (val1 >= val4)); // 10 >= 10 true
        System.out.println("val1 >= val3 " + (val1 >= val3)); // 10 >= -5 true

        System.out.println(""); //строка разделения
        // оператор <= маньше либо равно
        System.out.println("val1 <= val2 " + (val1 <= val2)); // действительно ли val1 <= val2, 10 <= 15 true
        System.out.println("val1 <= val4 " + (val1 <= val4)); // 10 <= 10 true
        System.out.println("val1 <= val3 " + (val1 <= val3)); // 10 <= -5 false

        System.out.println(""); //строка разделения
        // сравнение разных типов переменных
        double dbVal = 10.5;
        System.out.println("val1 >= dbVal " + (val1 >= dbVal)); // 10.0 >= 10.
        System.out.println("val1 <= dbVal " + (val1 <= dbVal)); // 10.0 <= 10.5

        System.out.println(""); //строка разделения
        System.out.println("val1 >= (int) dbVal " + (val1 >= (int) dbVal)); // 10.0 <= 10.5

        // округление
        System.out.println("Округление double dbVal: " +Math.round(dbVal)); // в большую сторону
        System.out.println("Преобразование double dbVal: " +(int)dbVal); // в меньшую сторону
    }
}
