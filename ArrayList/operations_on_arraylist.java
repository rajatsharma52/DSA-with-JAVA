package ArrayList;

import java.util.ArrayList;

public class operations_on_arraylist {
    public static void main(String[] args) {
        //Create a arraylist
        ArrayList<Integer> list= new ArrayList<>();

        // Operations on arraylist

        // 1. Add operation and Time complexity is O(1)
        list.add(1);
        list.add(3);
        list.add(4);

        list.add(1, 2); //This method takes the O(n) time complexity.
        System.out.println(list);

        // 2. Get operation and Time Complexity is O(1)
        int element= list.get(2);
        System.out.println(element);

        // 3. Remove operation and Time Complexity is O(n)
        list.remove(2);
        System.out.println(list);

        // 4. Set Element at index and Time Complexity is O(n)
        list.set(2, 3);
        System.out.println(list);

        //5. Contains Element and Time Complexity is O(n)
        System.out.println(list.contains(3));
        System.out.println(list.contains(15));
    }
    
}
