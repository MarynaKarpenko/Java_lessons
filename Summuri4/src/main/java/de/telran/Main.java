package de.telran;

import holder.SwitchHolder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(SwitchHolder.hold("Password"));
        System.out.println(SwitchHolder.hold("Security"));
        System.out.println(SwitchHolder.hold("User123"));
        System.out.println(SwitchHolder.hold("1970"));
        System.out.println(SwitchHolder.hold("Security987656546"));
        System.out.println(SwitchHolder.hold("Password_5qre"));
        System.out.println(SwitchHolder.hold("Security4356"));
        System.out.println(SwitchHolder.hold("User12323543"));
        System.out.println(SwitchHolder.hold("19702355"));
        System.out.println(SwitchHolder.hold("Security53598765"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Ваше имя");

        String[] answer = SwitchHolder.checkName(scanner.nextLine());
        int index = 0;

        while (true) {
            if (index < answer.length) {
                System.out.println(answer[index]);
                index++;
            } else {
                break;
            }
        }
    }
}
