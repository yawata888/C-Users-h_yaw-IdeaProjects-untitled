package org.Coding;

public class VowelsCounter {
    public static void main(String[] args) {
        String input = "Hideki";
        int vowelCount = countVowels(input);
        System.out.println("The number of vowels in \"" + input + "\" is: " + vowelCount);
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();

        String vowels = "aeiou && AEIOU";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
