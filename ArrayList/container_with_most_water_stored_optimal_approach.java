package ArrayList;

import java.util.ArrayList;

public class container_with_most_water_stored_optimal_approach {

    public static int maxstoreWater(ArrayList<Integer> height){
        // We apply 2-pointer approach for the optimal solution i.e Time Complexity= O(n)
        int maxWaterStored= 0;
        
        // create 2 poiner left pointer(lp) and right pointer(rp)
        int lp= 0;
        int rp= height.size()-1; //i.e n-1

        while(lp < rp){
            //calculate water area
            int ht= Math.min(height.get(lp), height.get(rp));
            int width= rp - lp;
            int currWaterStored= ht * width;
            maxWaterStored= Math.max(maxWaterStored, currWaterStored);

            // update pointers
            if(height.get(lp) < height.get(rp)){
                lp++;
            }
            else{ //i.e height.get(rp) >= height.get(lp)
                rp--;
            }
        }
        return maxWaterStored;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height= new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("Most water stored is: " + maxstoreWater(height));
    }
    
}
