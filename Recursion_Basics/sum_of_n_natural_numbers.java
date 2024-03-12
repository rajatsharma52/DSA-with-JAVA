package Recursion_Basics;

public class sum_of_n_natural_numbers {
    public static int calculateSum(int n){
        // Base case
        if(n == 1){
            return 1;
        }
        int fn_1= calculateSum(n-1);
        int fn= n + fn_1;
        return fn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(calculateSum(n));
    }
    
}
