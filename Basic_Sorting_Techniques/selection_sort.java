package Basic_Sorting_Techniques;

public class selection_sort {

    public static void selectionSort(int arr[]){
        // outer loop for calculate turns.
        for(int i=0; i<arr.length-1; i++){
            int minPos= i;
            // inner loop
            for(int j=i+1; j<arr.length; j++){
                // comparison
                if(arr[minPos]> arr[j]){
                    minPos= j;
                }
            }
            // swap
            int temp= arr[minPos];
            arr[minPos]= arr[i];
            arr[i]= temp;
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
        selectionSort(arr);
        printArr(arr);
        
    }
    
}
