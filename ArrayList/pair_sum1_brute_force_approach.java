package ArrayList;

import java.util.ArrayList;

public class pair_sum1_brute_force_approach {
    public static boolean pairSum1(ArrayList<Integer> list, int target){
        //Brute force approach and Time complexity is O(n^2)

        //Find all possible pairs
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

        //List is in sorted order.
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target= 5;
        System.out.println(pairSum1(list, target));
    }
    
}
