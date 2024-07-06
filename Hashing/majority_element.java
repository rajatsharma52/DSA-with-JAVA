package Hashing;

import java.util.*;

public class majority_element {
    public static void main(String[] args) {
        int arr[]= {1,3,2,5,1,3,1,5,1};
        
        // Create the HashMap
        HashMap<Integer, Integer> map= new HashMap<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
            // getOrDefault
            // if our key does not exist then our get method simply add the key in the Map.
            // if our key exist then our default method update the value of key, increase the key with 1.
            
            // We can use the if, else conditions if we did not use getOrDefault method
            // if(map.containsKey(arr[i])){  // key exist
            //     map.put(arr[i], map.get(arr[i]) + 1);
            // }
            // else{ // key does not exist
            //     map.put(arr[i], 1);
            // }
        }

        // Now run a loop on HashMap and find the key which comes more than n/3 times.
        for (Integer key : map.keySet()) {
            if(map.get(key) > arr.length/3){ // i,e n > n/3
                System.out.println("Majority element is: "+ key);
            }
        }
    }
    
}
