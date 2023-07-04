package de.telran.practice;

public class LogicTask {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 0;

        // ложное выражение в операторе if

        if ((a<b) && (b==c)) { // 1<2 && 2==3
            b = a+b+c;
            System.out.println("Сумма d = " +d);
        }
        else {
            System.out.println("Ложные значения");
        }

        System.out.println(""); //строка разделения


        // истинное выражение в операторе if

        if ((a<b) || (b==c)) { // 1<2 && 2==3
            b = a+b+c;
            System.out.println("Сумма d = " +d);
        }
        else {
            System.out.println("Ложные значения");
        }
    }
}
