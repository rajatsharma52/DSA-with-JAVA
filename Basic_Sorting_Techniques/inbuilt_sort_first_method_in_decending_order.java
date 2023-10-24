package Basic_Sorting_Techniques;
import java.util.Arrays;
import java.util.Collections;

public class inbuilt_sort_first_method_in_decending_order{
    //function for printing our sorted array.
      public static void printArr(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[]= {5,4,1,3,2};
        // Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        printArr(arr);
    }
}