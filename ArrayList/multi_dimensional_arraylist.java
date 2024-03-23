package ArrayList;

import java.util.ArrayList;

public class multi_dimensional_arraylist {
    public static void main(String[] args) {

        //Creating a multi-dimensional list like this:
        // list1: 1 2 3 4 5
        // list2: 2 4 6 8 10
        // list3: 3 6 9 12 15
        
        // Create the mainList
        ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();

        // Create the other sub lists
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        ArrayList<Integer> list3= new ArrayList<>();

        // Add the elements in these smalls lists
        for(int i=1; i<=5; i++){
            list1.add(i*1); // 1 2 3 4 5 6
            list2.add(i*2); // 2 4 6 8 10
            list3.add(i*3); // 3 6 9 12 15
        }

        // Add these small lists to mainList
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        // Print these all list individually
        for(int i=0; i<mainList.size(); i++){
            // Create a another list which stores the mainList at ith index
            ArrayList<Integer> currList= mainList.get(i);
            //Now print the currList which prints all the lists individually
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
    
}
