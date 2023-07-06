package de.telran;

public class Test {
    public static void main(String[] args) {
        int idx = 0;
        idx++;
        System.out.println(idx);
        idx--;
        System.out.println(idx);
        idx = idx+1;
        System.out.println(idx);
        idx=-1;
        System.out.println(idx);

        if (idx>=0){
            --idx;
            System.out.println(idx);
        } else {
            idx++;
        }
        System.out.println((double) idx);
    }
}
