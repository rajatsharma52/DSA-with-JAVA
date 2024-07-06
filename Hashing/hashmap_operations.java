package Hashing;
import java.util.*;

public class hashmap_operations {

    public static void main(String[] args) {
        // Creating a HashMap for storing the country and country population
        HashMap<String, Integer> hm= new HashMap<>();

        // Insert or put(key,value) Operation
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Bhutan", 20);

        // Print the HashMap
        System.out.println(hm);

        // get(key) operation
        int population= hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia")); // return null value because key does not exist in HashMap

        // containsKey(key) operation
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia")); //return null

        // remove(key) operation
        hm.remove("China");
        System.out.println(hm);

        // print the size of HashMap
        System.out.println(hm.size());

        // check HashMap is empty or not
        System.out.println(hm.isEmpty());

        // clear operation----> it clear all the values of HashMap
        hm.clear();
        System.out.println(hm.isEmpty());
        System.out.println(hm);
    }
}