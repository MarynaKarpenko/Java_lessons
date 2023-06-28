package de.telran;

public class Constructor {
    public static void main(String[] args) {
        int javaInt;
        javaInt = 15;

        Test javaTest;
        javaTest = new Test();
        System.out.println(javaTest.myIntTest);
        javaTest.run();

        Test myTestWithParametr = new Test(22);
        System.out.println(myTestWithParametr.myIntTest);

        // вызов метода
        outString("Передаваемая строка");
        String myStr = "Пример";
        outString(myStr);
        outTwoValue(myStr, 10);
    }

    // метод
    static void outString(String inStr) {
        String localStr = inStr.toLowerCase(); //запуск в нижнем регистре
        System.out.println("Local string: "+localStr);

        System.out.println("Out string: "+inStr);
    }
    static void outTwoValue(String inStr, int inInt) {
        String upperStr = inStr.toUpperCase(); //запуск в верхнем регистре
        System.out.println("Out string: "+inStr);
        System.out.println("Out number: "+inInt);
        System.out.println("Upper string: "+upperStr);


    }
}
