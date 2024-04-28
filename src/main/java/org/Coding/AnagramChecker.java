package org.Coding;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagram = areAnagrams(str1, str2);
        System.out.println("The strings \"" + str1 + "\" and \"" + str2 + "\" are anagrams: " + isAnagram);
    }

    public static boolean areAnagrams(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);


        return Arrays.equals(array1, array2);
    }
}
