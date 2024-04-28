package org.Coding;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("Hideki");
        listWithDuplicates.add("Hiroki");
        listWithDuplicates.add("Hideki");
        listWithDuplicates.add("John");
        listWithDuplicates.add("Josh");

        System.out.println("Original list: " + listWithDuplicates);

        List<String> listWithoutDuplicates = new ArrayList<>(new LinkedHashSet<>(listWithDuplicates));

        System.out.println("List after removing duplicates: " + listWithoutDuplicates);
    }
}
