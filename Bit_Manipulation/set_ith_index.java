package Bit_Manipulation;

public class set_ith_index {
    public static int setIthindex(int n, int i){
        int bitMask= 1 << i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(setIthindex(10, 2));
    }
    
}
