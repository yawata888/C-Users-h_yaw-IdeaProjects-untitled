package org.Coding;

public class StringSwap {
    public static void main(String[] args) {
        String a = "Love";
        String b = "Java";

        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b;

        b = a.substring(0, a.length() - b.length());

        a = a.substring(b.length());

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
