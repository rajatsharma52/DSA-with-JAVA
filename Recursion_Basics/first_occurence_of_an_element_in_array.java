package Recursion_Basics;

public class first_occurence_of_an_element_in_array {
    public static int firstOccurence(int arr[], int key, int i){
        // Base case
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key,i+1);
    }
    public static void main(String[] args) {
        int arr[]= {8,3,6,9,5,10,2,5,3};
        System.out.println("Index is: "+ firstOccurence(arr, 5, 0));
    }
    
}
