package de.telran;

public class Main2 {    public static void main(String[] args) {
    NotMain notMain = new NotMain();
    System.out.println(notMain.size);
    increaseSize(notMain);
    System.out.println(notMain.size);
    NotMain secondNotMain = new NotMain();
    increaseSize(secondNotMain);
    increaseSize(secondNotMain);
    System.out.println(notMain.size);
    System.out.println(secondNotMain.size);    }

    private static void increaseSize(NotMain innerNotMain) {
        innerNotMain.size++;
        innerNotMain.size =  innerNotMain.size +1;
    }
}

