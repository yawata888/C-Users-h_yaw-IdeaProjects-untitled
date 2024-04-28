package org.Coding;

import java.util.HashMap;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String input = "abracadabra";
        char result = findFirstNonRepeatingChar(input);
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("There are no non-repeating characters in the string.");
        }
    }

    public static char findFirstNonRepeatingChar(String str) {
        HashMap<Character, Integer> charCounts = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            if (charCounts.get(c) == 1) {
                return c;
            }
        }
        return '\0';
    }
}
