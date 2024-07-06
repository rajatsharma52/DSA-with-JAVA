package Hashing;

import java.util.*;

public class linked_hashmap {
    public static void main(String[] args) {
        
        // Create a LinkedHashMap
        // LinkedHashMap is a ordered HashMap while, simple HashMap is unordered HashMap.
        
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
    }
}
