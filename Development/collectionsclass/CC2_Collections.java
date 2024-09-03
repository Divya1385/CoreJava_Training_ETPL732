package com.evergent.corejava.collectionsclass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CC2_Collections {
    public static void main(String[] args) {
        // Creating a list of integers
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("grapes");
        fruits.add("pineapple");

        // Before Sorting List
        System.out.println("Original list: " + fruits);

        // Sorting the list in natural order (alphabetical order)
        Collections.sort(fruits);

        // Display the  After sorted list
        System.out.println("Sorted list (ascending order): " + fruits);
    }
}
