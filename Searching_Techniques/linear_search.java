package Searching_Techniques;

public class linear_search {

    // Linear Search.

    public static int linearSearch(int num[], int key){

        for(int i=0; i<num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1; //If key is not present in the array then gives us -1.

    }

    public static void main(String[] args) {
        int num[]= {2,4,6,8,10,12,14,16};
        int key= 10;
        // In case of key= 20 the result is -1 because 20 is not present in the array.
        // int key= 20;
    

        int index= linearSearch(num, key);

        if(index == -1){
            System.out.println("Index Not Found Because Key is not present in the Array");
        }
        else{
            System.out.println("Key is at Index: " + index);
        }
        
    }
    
}
// Time Complexity is= O(n)
