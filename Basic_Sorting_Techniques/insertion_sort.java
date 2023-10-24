package Basic_Sorting_Techniques;

public class insertion_sort {

    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr= arr[i];
            int prev= i-1;
            // find out correct position to insert.
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1]= arr[prev];
                prev--;
            }
            // insertion for our element
            arr[prev+1]= curr;
        }
    }
    // Another function for printing our sorted array.
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= {5,4,1,3,2};
        insertionSort(arr);
        printArr(arr);
    }
    
}
