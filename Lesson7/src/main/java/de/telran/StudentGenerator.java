package de.telran;

//Выбор случайного студента для вопроса:
//Напишите метод, который принимает на вход
// количество студентов и “рандомально” выбирает
// любого студента начиная со второго включительно.
//Например: в зуум сейчас присутствуют 10 участников.
// Первый участник - это преподаватель. Выбор должен
// быть сделан из 9 последующих, т.е. число выбирается
// из диапазона 2-10.

import java.util.Random;

public class StudentGenerator {
    public static void main(String[] args) {
        // генерим номер студента
        Random random = new Random();
        int numStudent = random.nextInt(25)+1; // отсчет от 0
        System.out.println("Номер студента: "+numStudent);

        // работа с методами
        int sumTemp = sumTwoNumbers(numStudent, 5);
        System.out.println("Сумма номера студента: "+sumTemp);

        System.out.println("Сумма двух чисел: "+sumTwoNumbers(numStudent, 5)); // возвращаем сложение двух чисел: номер студента + 5

        System.out.println("Деление двух чисел: "+divideTwoNumbers(numStudent, 2)); // возвращаем деление двух чисел: номер студента / 2

        System.out.println("Деление двух чисел через double: "+divideTwoDoubleNumbers(numStudent, 2)); // возвращаем деление двух чисел: номер студента / 2 (второй вариант)

        System.out.println("Деление двух чисел через double: "+divideTwoDoubleNumbers(numStudent, 0)); // деление на 0, делить на 0 нельзя, 0 = Infinity

        System.out.println("Деление на 0: "+numStudent/1);

        // выводим четное и нечетное число
        findEvenOdd(2);
        findEvenOdd(5);
        findEvenOdd(numStudent);
    }

    // метод сложения двух чисел (номер студента и сисло)
    static int sumTwoNumbers(int arg1, int arg2) {
        int sumLocal = arg1+arg2;
        return sumLocal;
    }

    // метод деления двух чисел (номер студента и сисло)
    static double divideTwoNumbers(int arg1, int arg2) {
        double divideLocal = (double) arg1 / arg2;     // double - деление с отстатком
        return divideLocal;
    }

    // второй метод деления двух чисел (номер студента и сисло)
    static double divideTwoDoubleNumbers(double arg1, int arg2) {
        double divideLocal = arg1 / arg2;
        return divideLocal;
    }

    // ищем четное и нечетное число
    static void findEvenOdd(int num) {
        if (num%2==0) {
            System.out.println(num+" четное");
        } else {
            System.out.println(num+" нечетное");
        }
    }
}

// debug проверка на баги или проверить где в программе была ошибка
// поставить кружечки красныне для проверки от точки до точки
// можно в точке остановки задать параметр condition, напр. numStudent>10. Ост только тогда, когда номер студента будет больше 10
// evaluate expression - что-то отслеживать
// можно добавить что-то в окно add to Watches
// evaluate проверить что-то можно ввести какое-то значение, выделить то что нужно проверять, нажать пр кн и вызвать evaluate
// step over или F8 построчно проверить где возникла ошибка

