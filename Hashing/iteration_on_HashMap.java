package Hashing;

import java.util.*;

public class iteration_on_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm= new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);
        
        // Iterate
        // Using the SET for iteration
        Set<String> keys= hm.keySet();
        System.out.println(keys);

        // I run a loop on keys(SET) and take the value of each key from the HashMap
        // Using foreach loop
        for (String k : keys) {
            System.out.println("Key= " + k + ", Value= " + hm.get(k));
        }
    }
}
