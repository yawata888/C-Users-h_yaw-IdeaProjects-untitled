package org.Coding;

public class StringCount {
    public static void main(String[] args) {
        String inputString = " I love Java so much !! ";
        int stringCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            // Check if the character is a letter
            if (Character.isLetter(inputString.charAt(i))) {
                stringCount++;
            }
        }

        // Print the result
        System.out.println("The number of alphabetic characters is: " + stringCount);
    }
}
