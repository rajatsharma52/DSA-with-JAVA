package Arrays;
import java.util.*;

public class find_largest_smallest_num_in_array {

    public static int getLargest_Smallest(int num[]){

        int largest= Integer.MIN_VALUE; //--> -infinity

        // int smallest= Integer.MAX_VALUE; //--> +infinity

        for(int i=0; i<num.length; i++){

            if(largest< num[i]){
                largest= num[i];

            }
            // if(smallest> num[i]){
            //     smallest= num[i];
            // }

        }

        // We can return only one value from function so we print the smallest value in the function.
        // System.out.println("Smallest value is: "+ smallest);
        return largest;
    }


    public static void main(String[] args) {

        int num[]= {1,2,6,3,5};

        System.out.println("Largest number in tha array is: " + getLargest_Smallest(num));
        
    }
    
}
