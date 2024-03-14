package Recursion_Basics;

public class print_x_to_the_power_n {
    public static int calculatePow(int x, int n){
        // Base case
        if(n == 0){
            return 1;
        }
        // int xn_1= calculatePow(x, n-1);
        // int xn= x * xn_1;
        // return xn;

        // Or we can right these 3 lines in one line like
        return x * calculatePow(x, n-1);
        // Both are same
    }
    public static void main(String[] args) {
        System.out.println(calculatePow(2, 10));
    }
    
}
