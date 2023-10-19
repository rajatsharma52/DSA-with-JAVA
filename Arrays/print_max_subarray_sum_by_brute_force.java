package Arrays;

public class print_max_subarray_sum_by_brute_force{

    public static void maxSubarraySum(int num[]){

        int currsum=0;
        int maxsum= Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            int start= i;
            for(int j=i; j<num.length; j++){
                int end= j;
                currsum=0;
                for(int k=start; k<=end; k++){ //print subarrays
                    // subarrays sum
                    currsum+= num[k];
                }
                System.out.println(currsum);
                if(maxsum< currsum){
                    maxsum= currsum;
                }
            }
        }
        System.out.println("maxsum is: " + maxsum);
    }

    public static void main(String[] args) {
        int num[]= {1,-2,6,-1,3};
        maxSubarraySum(num);
    }
    
}
