package Arrays;

public class subarrays {

    public static void printSubarrays(int num[]){

        int ts=0; //Calculate total subarrays.

        for(int i=0; i<num.length; i++){
            int start= i;

            for(int j=1; j<num.length; j++){
                int end= j;

                for(int k= start; k<= end; k++){ //print subarray.
                    System.out.print(num[k] + " "); //subarrays.

                }
                 ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays is: " + ts);
    }

    public static void main(String[] args) {
        int num[]= {2,4,6,8,10};
        printSubarrays(num);
    }
    
}
