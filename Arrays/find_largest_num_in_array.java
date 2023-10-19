package Arrays;

import java.util.*;

public class find_largest_num_in_array {

    public static int getLargest(int num[]){

        int largest= Integer.MIN_VALUE; //--> -infinity

       

        for(int i=0; i<num.length; i++){

            if(largest< num[i]){
                largest= num[i];

            }
            

        }

        return largest;
    }


    public static void main(String[] args) {

        int num[]= {1,2,6,3,5};

        System.out.println("Largest number in tha array is: " + getLargest(num));
        
    }
    
}

