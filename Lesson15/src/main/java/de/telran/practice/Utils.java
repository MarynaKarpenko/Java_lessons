package de.telran.practice;

public class Utils {
    public static void sortBubblePrice(Car[] sortCars) {
        boolean isChange = true;
        int size = sortCars.length - 1;
        while (isChange) {
            isChange = false;
            for (int i = 0; i < size; i++) {
                if (sortCars[i].getPrice() > sortCars[i + 1].getPrice()) {
                    isChange = true;
                    Car temp = sortCars[i];
                    sortCars[i] = sortCars[i + 1];
                    sortCars[i + 1] = temp;
                }
            }
            size--;
        }
    }

    public static void sortBubbleName(Car[] sortCars) {
        boolean isChange = true;
        int size = sortCars.length - 1;
        while (isChange) {
            isChange = false;
            for (int i = 0; i < size; i++) {
                if (sortCars[i].getModel().charAt(0) > sortCars[i + 1].getModel().charAt(0)) {
                    isChange = true;
                    Car temp = sortCars[i];
                    sortCars[i] = sortCars[i + 1];
                    sortCars[i + 1] = temp;
                }
            }
            size--;
        }
    }
}
