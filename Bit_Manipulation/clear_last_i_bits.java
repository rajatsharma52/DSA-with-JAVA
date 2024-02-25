package Bit_Manipulation;

public class clear_last_i_bits {
    public static int clearLastiBit(int n, int i){
        // int BitMask= (-1) << i; //In place of -1 we can use (~ 0) both are same.
        int BitMask= (~ 0) << i;
        return n & BitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearLastiBit(15, 2));
        
    }
    
}
