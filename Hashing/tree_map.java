package Hashing;

import java.util.*;

public class tree_map {
    public static void main(String[] args) {
        // Create a TreeMap
        // In TreeMap keys are in sorted order.

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adding elements to the TreeMap
        treeMap.put("India", 100);
        treeMap.put("China", 150);
        treeMap.put("US", 50);
        treeMap.put("Bhutan", 20);

        // Now create a LinkedHashMap
        LinkedHashMap<String, Integer> lhm= new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);
        lhm.put("Bhutan", 20);

        // Now create a simple HashMap
        HashMap<String, Integer> hm= new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Bhutan", 20);

        //print the LinkedHashMap and HashMap

        System.out.println(hm); // Print HashMap
        System.out.println(lhm); // Print LinkedHashMap
        System.out.println(treeMap); // Print TreeMap
    }
}
