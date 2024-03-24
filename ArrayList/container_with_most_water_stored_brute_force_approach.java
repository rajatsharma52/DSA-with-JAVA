package ArrayList;

import java.util.ArrayList;

public class container_with_most_water_stored_brute_force_approach {
    public static int maximumWater(ArrayList<Integer> height){
        int maxWaterStored= 0;
        
        // Find all the pairs
        for(int i=0; i<height.size(); i++){
            for(int j= i+1; j<height.size(); j++){
                int ht= Math.min(height.get(i), height.get(j));
                int width= j - i;
                int currWaterStored= ht * width;
                maxWaterStored= Math.max(maxWaterStored, currWaterStored);
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
        System.out.println("Maximum water stored is: " + maximumWater(height));
    }
    
}
