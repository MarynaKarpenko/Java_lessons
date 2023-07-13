package de.telran.practice;

public class ArrObj {
    public static void main(String[] args) {
        // работа со строками
        String[] arrStr = new String[3];
        arrStr[0] = "String 1";
        arrStr[2] = "String 3";
        System.out.println("\n------arrStr-------");
        for (String val : arrStr) System.out.println(val);

        String[] arrStrLiteral = {"Str 1", "Str 2", "Str 3"};
        System.out.println("\n-----arrStrLiteral------");
        for (String val : arrStrLiteral) System.out.println(val);

        // работа с объектами
        Pen[] pens = new Pen[3];

        // создание объекта без конструктора
        pens[0] = new Pen();
        pens[0].setColor("blue");

//        pens[1] = new Pen();
//        pens[1].setColor("red");

        // создание объекта через конструктор
        pens[1] = new Pen("red");

        // создание через объект
        Pen pen = new Pen("black");
        pens[2] = pen;


        System.out.println("\n-----pens-----");
        for (Pen val : pens) System.out.println(val);
        System.out.println(pens[0].getColor());
        System.out.println(pens[1].getColor());
        System.out.println(pens[2].getColor());

        System.out.println();
        // выыод информ о цветах через for
        for (Pen val : pens) System.out.println(val.getColor());


        System.out.println();
        // создание нового массива с помощью Literal
        Pen[] pensLiteral = {new Pen("yellow"),
                                new Pen("green")};
        for (Pen val : pensLiteral) System.out.println(val.getColor());
    }
}
