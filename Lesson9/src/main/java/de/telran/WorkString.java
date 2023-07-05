package de.telran;

import java.util.Random;

public class WorkString {
    public static void main(String[] args) {
        isDarkOrLight("белый");

        boolean bVal = true;
        if(bVal) System.out.println("Истина");
    }

    static void isDarkOrLight(String color) {
        if (color.equalsIgnoreCase("white") || color.equalsIgnoreCase("белый") ) {
            System.out.println(color + " - светлый (light)");
        } else if (color.equalsIgnoreCase("black") || color.equalsIgnoreCase("черный")) {
            System.out.println(color + " - темный (dark)");
        } else if (color.equalsIgnoreCase("green") || color.equalsIgnoreCase("зеленый")) {
            System.out.println(color + " - светлый (light)");
        } else if (color.equalsIgnoreCase("brown") || color.equalsIgnoreCase("коричневый")) {
            System.out.println(color + " - темный (dark)");
        } else {
            System.out.println(color + " - не можем определить");
        }
    }
}
