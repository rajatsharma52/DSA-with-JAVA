package Searching_Techniques;

public class binary_search {

    public static int binarySearch(int num[], int key){
        
        // Initialize our index start and end
        int start= 0, end= num.length-1;

        while(start <= end){

            // Calculate mid.
            int mid= (start + end)/2;

            // Comparisons

            if(num[mid] == key){
                // Key found.
                return mid;
            }
            if(num[mid] < key){
                // Search at right side.
                start= mid+1;
            }
            else{
                // Search at left side.
                end= mid-1;
            }
        }
        return -1; //If key is not present in the array then gives us -1.

    }



    public static void main(String[] args) {

        int num[]= {2,4,6,8,10,12,14};
        int key= 10;

        System.out.println("Index for key is:" + binarySearch(num, key));
        
    }
    
}
// Time complexity is= O(logn).
// Time complexity of binary search is always small in compare of linear search.