package Bit_Manipulation;

import java.util.Scanner;

public class get_ith_bit {
    public static int giveIthindex(int n, int i){
        int bitMask= 1 << i;
        int ans= (n & bitMask);
        if(ans == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
       System.out.println( giveIthindex(15, 2));
      
    }
    
}
