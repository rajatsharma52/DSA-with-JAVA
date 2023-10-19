package Arrays;

public class print_max_subarray_sum_by_prefix_sum {

    public static void maxSubarraySum(int num[]){

        int currsum=0;
        int maxsum= Integer.MIN_VALUE;
        int prefix[]= new int[num.length];

        prefix[0]= num[0];
        // calculate prefix array.
        for(int i=1; i<prefix.length; i++){
            prefix[i]= prefix[i-1]+ num[i];

        }
        for(int i=0; i<num.length; i++){
            int start=i;
            for(int j=1; j<num.length; j++){
                int end= j;
                currsum= start==0 ? prefix[end]:prefix[end] - prefix[start-1];
                if(maxsum<currsum){
                    maxsum= currsum;
                }
            }
        }
        System.out.println("Max sum is: " + maxsum);
    }

    public static void main(String[] args) {
        int num[]= {1,-2,6,-1,3};
        maxSubarraySum(num);
    }
    
}
