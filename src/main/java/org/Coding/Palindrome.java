package org.Coding;

public class Palindrome {
    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = isPalindrome(input);
        System.out.println("The string \"" + input + "\" is a palindrome: " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
