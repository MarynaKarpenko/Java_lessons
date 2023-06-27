package de.telran;

public class StackHeap {
    public static void main(String[] args) {
        int myInt1 = 10;
        Test test1 = new Test();
        String myStr1 = new String("My String");
        String myStr2 = "My String";
        System.out.println(myStr2);
        System.out.println(myStr2.length()); //длина строки
        System.out.println(myStr2.charAt(5)); // получить символ из строки по индексу
        System.out.println(myStr2.charAt(myStr2.length()-1)); //получить последний символ из строки

        System.out.println(myStr2.substring(0, 2));
        String myStr3 = myStr2.substring(3);
        System.out.println(myStr3);

        System.out.println("My String \n"+myStr3); // перенести на другую строку myString3

        int myInt2 = myInt1;
        System.out.println(myInt1+" ---- "+myInt2);
        myInt2 = 20;
        System.out.println(myInt1+" ---- "+myInt2);

        Test test2 = test1;
        System.out.println(test1.myIntTest+" ---- "+ test2.myIntTest);

        test1.myIntTest = 55;
        System.out.println(test1.myIntTest+" ---- "+ test2.myIntTest);

        test2.myIntTest = 99;
        System.out.println(test1.myIntTest+" ---- "+ test2.myIntTest);


        // char
        char c = 'r';
        System.out.println(c);
        System.out.println(Character.hashCode(c));

        c = '\n';
        System.out.println(c);
        System.out.println(Character.hashCode(c));
    }
}
