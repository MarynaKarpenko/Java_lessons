package de.telran;

public class LogicOperators {
    public static void main(String[] args) {
        int val1 = 10, val2 = 15, val3 = -5, val4 = 10;

        System.out.println("val1 < val2: " + (val1<val2)); // 10>15 true
        System.out.println("val1 == val4: " + (val1==val4)); // 10==10 true

        System.out.println(""); //строка разделения


        // логический оператор И (&&)
        System.out.println("val1 < val2 AND val1 == val4: " + ((val1<val2) && (val1==val4))); // оператор "и"
        // с друх сторон верное решение

        System.out.println(""); //строка разделения
        System.out.println("val1 < val2 AND val1 == val3: " + ((val1<val2) && (val1==val3))); // оператор "и"
        // с одной стророны false 10<15 && 10==-5 в итоге будет false

        System.out.println(""); //строка разделения
        System.out.println("val1 < val2 AND val1 == val3 AND val1 > val3: "
                + ((val1<val2) && (val1==val3) && (val1 > val3)));
        // 10<15 && 10==10 && 10>-5

        System.out.println(""); //строка разделения


        // логический оператор ИЛИ (||)
        System.out.println("val1 < val2 OR val1 == val4: " + ((val1<val2) || (val1==val4))); //10<15 || 10==10
        System.out.println("val1 < val2 OR val1 == val3: " + ((val1<val2) || (val1==val3))); //10<15 || 10==-5
        System.out.println("val1 < val2 OR val1 == val4 OR val1 <= val3: "
                + ((val1<val2) || (val1==val4) || (val1 <= val3)));
        // 10<15 || 15==10 || 10<=-5 true
        System.out.println("val1 > val2 || val2 == val4 || val1 <= val3 "
                + ((val1 > val2) || (val2 == val4)  || (val1 <= val3)));
        //10>15 || 15==10 || 10<=-5 false

        System.out.println(""); //строка разделения


        // логический оператор ОТРИЦАНИЕ (!) NOT
        System.out.println("val1 < val2: " + (val1 < val2)); // 10<15 true
        System.out.println("val1 < val2: " + !(val1 < val2)); // !(10<15) false,
        // ! - меняет значение на противоположное, тоисть 15<10

        System.out.println("val1 > val2: " + !(val1 > val2)); // !(10>15) true
        // ! - меняет значение на противоположное, тоисть 15>10
        System.out.println("!(val1 < val2 NOT val1 == val4 NOT val1 <= val3): "
                + !((val1<val2) || (val1==val4) || (val1 <= val3)));
        System.out.println("!(val1 < val2 NOT val1 == val3 NOT val1 > val3): "
                + !((val1<val2) && (val1==val3) && (val1 > val3)));
    }
}
