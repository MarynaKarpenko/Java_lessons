package de.telran.practice;

import java.util.Arrays;

public class TestAuto {
    public static void main(String[] args) {
        Car[] cars = {new Car(30000, "BMW"),
                      new Car(20000, "Volkswagen Golf"),
                      new Car(50000, "Tesla"),
                      new Car(15000, "Nissan Leaf")};
        System.out.println(cars.length);
        for (Car car : cars) System.out.println(car);

        Utils.sortBubblePrice(cars);
        System.out.println("После сортировки по цене: ");
        for (Car car : cars) System.out.println(car); // после сортировки

        Utils.sortBubbleName(cars);
        System.out.println("После сортировки по имени: ");
        for (Car car : cars) System.out.println(car); // после сортировки


//// Компаратор через анонимный класс
//        Comparator<Car> comparator = new Comparator<Car>() {
//            @Override
//            public int compare(Car o1, Car o2) {
//                return (o1.getPrice() < o2.getPrice()) ? -1 : ((o1.getPrice() == o2.getPrice()) ? 0 : 1);
//            }
//        };
//
//        Arrays.sort(cars, comparator);
//        System.out.println("После стандартной сортировки по цене: ");
//        for (Car car : cars) System.out.println(car); //напечатать массив
//
//        // Компаратор через функциональный интерфейс
//        Arrays.sort(cars, (o1, o2) -> o1.getModel().compareTo(o2.getModel()));
//        System.out.println("После стандартной сортировки модели: ");
//        for (Car car : cars) System.out.println(car); //напечатать массив
    }
}
