package Arrays;

public class reverse_an_array {

    public static void reverse(int num[]){

        int first=0, last= num.length-1;

        while(first < last){

            // swap the values.

            int temp= num[last];
            num[last]= num[first];
            num[first]= temp;

            first++;
            last--;
        }
        return;
        
    }

    public static void main(String[] args) {
        int num[]= {2,4,6,8,10};

        reverse(num);

        // print the array.
        for(int i=0; i< num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
    
}
