package org.Coding;

public class WordCounter {
    public static void main(String[] args) {
        String input = "Hello, world!";
        int wordCount = countWords(input);
        System.out.println("The number of words in the input string is: " + wordCount);
    }

    public static int countWords(String str) {
        String sanitizedStr = str.replaceAll("[^a-zA-Z ]", "");
        String[] words = sanitizedStr.split("\\s+");
        return words.length;
    }
}
