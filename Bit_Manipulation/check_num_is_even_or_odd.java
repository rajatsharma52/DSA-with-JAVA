package Bit_Manipulation;

import java.util.Scanner;

public class check_num_is_even_or_odd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n= sc.nextInt();
        int bitMask = 1; //Bitmsk is 1 because we AND our n with 1, either taking bitMask we direct AND with 1.
        int ans= (n & bitMask);
        if(ans == 1){
            System.out.println("Number is odd");
        }
        else{
            System.out.println("Number is even");
        }
    }
    
}
