package animals;

public class Dog {

    public String name; // переменные экземпляра, пренадл объекту созданному на основе класса

    public int age;

    public Dog() {

        System.out.println("Это конструктор класса Dog");

        System.out.println("Объэкт класса Dog был создан");
    }
    public Dog(String name) { // конструктор
        this.name = name;
    }

    public Dog(String name, int age) {

    }
}
