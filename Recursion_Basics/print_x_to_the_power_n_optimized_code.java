package Recursion_Basics;

public class print_x_to_the_power_n_optimized_code {
    public static int optimizedPower(int x, int n){
        // Base case
        if(n == 0){
            return 1;
        }
        int halfPower= optimizedPower(x, n/2);
        // Condition 1: if n is even
        int halfPowerSq= halfPower * halfPower;
        
        // Condition 2: if n is odd
        if(n % 2 != 0){
            halfPowerSq= x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x= 2;
        int n= 10;
        System.out.println(optimizedPower(x, n));
    }
    
}
