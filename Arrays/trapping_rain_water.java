package Arrays;

public class trapping_rain_water {
    public static int trappedRainwater(int height[]){
        int n= height.length;

        // Calculate left maximum boundary in form of array which is
        // known as "Auxiliary array".

        int leftMax[]= new int[n];
        leftMax[0]= height[0]; //For 1st height from stating of array.
        for(int i=1; i<n; i++){ //For remaing height of array.
            leftMax[i]= Math.max(height[i], leftMax[i-1]);

        }
        
        // Calculate right maximum boundary in form of array which is
        // known as "Auxiliary array".

        int rightMax[]= new int[n];
        rightMax[n-1]= height[n-1]; //For 1st height from ending of array.
        for(int i= n-2; i>=0; i--){ //For remaing height of array.
            rightMax[i]= Math.max(height[i], rightMax[i+1]);

        }
        int trappedWater=0;
        // Loop for calculatig waterLevel and trappedWater.
        for(int i=0; i<n; i++){
            //waterLevel= min(leftmax boundary, rightmax boundary).
            int waterLevel= Math.min(leftMax[i], rightMax[i]);
            // trappedWater= (waterLevel - height[i]) * width here width = 1.
            trappedWater+= (waterLevel - height[i]) * 1;
        }
        return trappedWater;
        
    }
    public static void main(String[] args) {
        int height[]= {4,2,0,6,3,2,5};
        System.out.println("Total trapped water is: " +trappedRainwater(height));
    }
    
}
