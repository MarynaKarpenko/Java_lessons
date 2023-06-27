package de.telran;

public class MyType {
    public static void main(String[] args) {
        byte myByte = 64; // число должно быть до 128
        int myInt = myByte;

        long myLong = 456;
        myByte = (byte)myLong;
        System.out.println(myLong);
        System.out.println(myByte);
    }
}
