public class first_occurence_of_a_number {
    public static int occurence(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {8,3,6,9,5,10,2,5,3};
        int key= 6;
        System.out.println(occurence(arr, key));
    }
    
}
