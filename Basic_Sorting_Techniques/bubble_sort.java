package Basic_Sorting_Techniques;

public class bubble_sort {

    public static void bubbleSort(int arr[]){
        // Outer loop for our turns.
        for(int turn=0; turn<arr.length; turn++){
            // inner loop for comparison
            for(int j=0; j<arr.length-1-turn; j++){
                // Now swap adjacent element.
                if(arr[j]> arr[j+1]){
                    // swap
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
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
        bubbleSort(arr);
        printArr(arr);
        
    }
}
