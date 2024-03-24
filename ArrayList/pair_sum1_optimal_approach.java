package ArrayList;

import java.util.ArrayList;

public class pair_sum1_optimal_approach {
    public static boolean pairSum1(ArrayList<Integer> list, int target){
        
        //Optimal solution using 2 pointer approach and Time complexity= O(n)
        int lp= 0;
        int rp= list.size()-1; // i.e n-1

        while(lp != rp){

            //Case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }

            //Case 2
            if(list.get(lp) + list.get(rp) < target){
                lp++;
            }

            //Case 3 i.e list.get(lp) + list.get(rp) > target
            else{
                rp--;
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
