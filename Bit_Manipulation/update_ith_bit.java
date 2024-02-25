package Bit_Manipulation;

public class update_ith_bit {
    

    public static int clearIthindex(int n, int i){
        int bitMask= ~(1<<i);
        return n&bitMask;
    }
    public static int setIthindex(int n, int i){
        int bitMask= 1 << i;
        return n | bitMask;
    }
    public static int updateIthBit(int n, int i, int newBit){
        // First Approach:-
        // if(newBit == 0){
        //     return clearIthindex(n, i);
        // }
        // else{
        //     return setIthindex(n, i);
        // }

        // Second Approach:-
        n= clearIthindex(n, i);
        int BitMask= newBit << i;
        return n | BitMask;

        // In both the approaches the Time Complexity is same we can use any of approach.
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
        
    }
    
}
