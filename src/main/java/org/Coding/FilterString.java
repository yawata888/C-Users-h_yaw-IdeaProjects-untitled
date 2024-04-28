package org.Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Onion", "Avocado", "Habanero", "Orange", "Pineapple");
        List<String> filteredStrings = filterAndLowercase(strings);

        System.out.println("Filtered and converted to lowercase: " + filteredStrings);
    }

    public static List<String> filterAndLowercase(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String str : list) {
            if (str.toUpperCase().startsWith("A")) {
                result.add(str.toLowerCase());
            }
        }
        return result;
    }
}
