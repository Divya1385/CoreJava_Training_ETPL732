package com.evergent.corejava.collections.map;

import java.util.Map;
import java.util.TreeMap;
/*
 *Sorted Order: TreeMap maintains its elements in ascending order of keys.
 * In this example, student IDs are sorted, so when we print the TreeMap, 
 * IDs are in ascending order.
 */
public class TreeMapDemo4 {
    public static void main(String[] args) {
        // Creating a TreeMap to store student records
        TreeMap<Integer, String> studentRecords = new TreeMap<>();

        // Adding student records to the TreeMap
        studentRecords.put(102, "Raju");
        studentRecords.put(101, "Bhaul");
        studentRecords.put(103, "Ramu");
        studentRecords.put(104, "David");
        
        System.out.println(studentRecords);

        // Displaying the TreeMap (sorted by student ID)
        System.out.println("Student Records (sorted by ID):");
        for (Map.Entry<Integer, String> entry : studentRecords.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        }
    }
