package Recursion_Basics;

public class friends_pairing_problem {
    public static int friendsPairing(int n){
        //Base case
        if(n == 1 || n == 2){
            return n;
        }

        // Choices
        // // 1.Single
        // int fn_1= friendsPairing(n-1);

        // // 2.Pairing
        // int fn_2= friendsPairing(n-2);
        // // Choice for pairs
        // int pairWays= (n-1) * fn_2;

        // // Total ways
        // int totalWays= fn_1 + pairWays;

        // return totalWays;

        //We can write this code in single return statement but base case is same.
        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
        
        // 1st condition for single i.e: friendsPairing(n-1)
        // 2nd condition for pairing i.e: (n-1) * friendsPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
        
    }
    
}
