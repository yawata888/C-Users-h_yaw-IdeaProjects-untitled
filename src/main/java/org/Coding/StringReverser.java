package org.Coding;

public class StringReverser {
    public static void main(String[] args) {
        String input = "Hello";
        String output = reverseString(input);
        System.out.println("The reversed string is: " + output);
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
