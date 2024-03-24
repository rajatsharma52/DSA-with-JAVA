package ArrayList;

import java.util.ArrayList;

public class pair_sum2 {

    public static boolean pairSum2(ArrayList<Integer> list, int target){
        //It is an optimal solution using 2-pointer approach and Time Complexity= O(n)
        int n= list.size();

        //Finding the breaking point or Pivot point of Arraylist
        int breakingPoint= -1;
        for(int i=0; i<n; i++){
            if(list.get(i) > list.get(i+1)){ //Breaking point
                breakingPoint= i;
                break;
            }
        }

        //Initialize left pointer and right pointer
        int lp= breakingPoint+1; //i.e lp= i+1
        int rp= breakingPoint; //i.e rp= i

        //Check the conditions
        while(lp != rp){
            
            //Case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }

            //Case 2
            if(list.get(lp) + list.get(rp) < target){
                //Update left pointer (lp)
                lp= (lp+1) % n;
            }

            //Case 3 i.e list.get(lp) + list.get(rp) > target
            else{
                //Update right pointer (rp)
                rp= (n + rp-1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //In this question our arraylist is Sorted and Rotated.
        ArrayList<Integer> list= new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target= 16;
        System.out.println(pairSum2(list, target));
    }
    
}
