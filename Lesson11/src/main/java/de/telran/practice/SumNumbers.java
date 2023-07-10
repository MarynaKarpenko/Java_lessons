package de.telran.practice;

public class SumNumbers {
    public static void main(String[] args) {
        System.out.println("Sum all numbers of 0 to max = " + sumMaxNumbers(4, 3));
    }
    static int sumMaxNumbers(int num1, int num2) {
        int sum = 0;
        int maxNumber = (num1 > num2) ? num1 : num2;

        /*        //аналог
        if(numb1 > numb2) maxNumb = numb1;
        else maxNumb = numb2;*/
        System.out.println("Max number " + maxNumber);
        for (int val = 1; val <= maxNumber; val++)
            sum += val; // sum = sum + val
        return sum;
    }
}
