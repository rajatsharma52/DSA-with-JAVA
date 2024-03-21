package ArrayList;

// import java.util.ArrayList;
// import java.util.Collections;
// Or we can use in place of these two
import java.util.*;

public class sort_an_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(3);

        System.out.println("List before sorting= " + list);

        // Sorting

        // 1. In ascending order
        Collections.sort(list);
        System.out.println("List after sorting in ascending order= " + list);

        // 2. In descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("List after sorting in descending order= " + list);
    }
    
}
