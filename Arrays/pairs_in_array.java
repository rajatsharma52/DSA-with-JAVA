package Arrays;

public class pairs_in_array {

    public static void printPairs(int num[]){

        int tp=0; //This variable tp is for calculate total pairs. Initialize it with 0.

        // First make a loop for our numbers.
        for(int i=0; i<num.length; i++){

            // Then make a current variable for our current number of array.
            int curr= num[i]; //Here first come 2, then 4, then 6, then 8 and make pair
            //  one by one with other numbers.
            // For example first come 2 then it pair with 4,6,8 and 10.
            // So the pair is (2,4) (2,6) (2,8) (2,10)

            // Make a loop for making the pairs of the current number.
            for(int j=i+1; j<num.length; j++){

                // Now print our pairs.

                System.out.print("(" + curr + "," + num[j] + ")");
                tp++; //After print every pair increase the total pairs tp.
            }
            System.out.println();
        }

        System.out.println("Total pairs are =" + tp); //Here print the total pairs.
        return;
    }

    public static void main(String[] args) {
        int num[]= {2,4,6,8,10};

        printPairs(num);

    }
}
