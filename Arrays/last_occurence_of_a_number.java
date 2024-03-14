public class last_occurence_of_a_number {
    public static int occurence(int arr[], int key){
        int n= arr.length;
        for(int i=n-1; i>1; i--){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {8,3,6,9,5,10,2,5,3};
        int key= 5;
        System.out.println(occurence(arr, key));
    }
    
}
