package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 25;
        int b = 75;

        System.out.println("a = " + a + " b = " + b);

//        int c = a;
//        a = b;
//        b = c;
        a += b;
        b = a - b;
        a -= b;
        System.out.println("a = " + a + " b = " + b);
    }
}
