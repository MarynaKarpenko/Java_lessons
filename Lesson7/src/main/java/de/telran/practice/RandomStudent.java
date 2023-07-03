package de.telran.practice;

public class RandomStudent {
    public static void main(String[] args) {
        System.out.println("Сгенерируемый номер студента: "+setStudentValue(25));
    }

    static int setStudentValue(int studentValue) {
        int max = studentValue;
        int min = 2;
        int randomStudentNumber = (int) (min + Math.random() * ((max - min)+1));
        return randomStudentNumber;
    }
}
