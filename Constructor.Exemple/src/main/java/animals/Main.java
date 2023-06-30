package animals;

public class Main { // конструктор - уникальный метод
    public static void main(String[] args) {
        System.out.println("Начало работы программы");

        Dog nameLessDog = new Dog();
        System.out.println(nameLessDog.name);

        System.out.println("----------------------");

        Dog sharik = new Dog("Шарик");    // переменная

        System.out.println("Я счастливая сабака, меня зовут: " + sharik.name);

        System.out.println("Конец работы программы");
    }
}
