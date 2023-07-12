package de.telran;

public class InnerClass {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        zoo1.open();

        Zoo.Monkey monkey = zoo1.new Monkey();
        monkey.runFood();
        Zoo.Monkey.Banana banana = monkey.new Banana();
        banana.getInfo();
    }
}

class Zoo {
    int count = 10; // характеристика
    private String phone = "1237634";
    void open () { // поведение
        System.out.println("Open from 9 to 18 -> see the monkey " + (new Monkey()).name); // обращение к объекту из верхнего уровня к нижнему
    }

    class Monkey { // Вложенный внутренний класс
        String name = "Mary";
        void runFood () {
            System.out.println("Monkey eat and smile, from the number of animals " + count + " call by phone " + phone);

            class Tail { // Локальный внутренний класс метода
                int length = 4;
                String runHelp () {
                    return (length > 3) ? " holding tail writing " : " waving its tail ";
                }
            }
            System.out.println((new Tail()).runHelp());
        }
        void runSmile () {
            System.out.println("Smile");
        }

        class Banana { // Вложенный внутренний класс
            String sort = "yellow";

            String getSort () {
                return sort;
            }
            void getInfo () {
                System.out.println(sort + "Eating a monkey named " + name + " from the number of animals " + count);
            }
        }
    }
}
