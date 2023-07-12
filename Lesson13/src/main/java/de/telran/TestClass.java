package de.telran;

public class TestClass {
    public static void main(String[] args) {
        Box box1;             // инициализация значением null
        box1 = new Box();
        box1.width =5;
        box1.height = 3;
        box1.length = 10;
        System.out.println(box1.calcVolume());

        Box box2 = new Box(5, 4,3);
        System.out.println(box2.calcVolume());
    }

}

// класс
class Box {

    // переменные пренадлежащие классу
    int width, height, length;

    public Box() {

    }

    // инициализирующий конструктор
    public Box (int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    // метод. поведение объекта
    int calcVolume() {
        return width * height * length;
    }
    // метод. поведение
    void create (int width, int height, int length) {
        System.out.println("Create the box, volume: " + calcVolume());
    }
}
