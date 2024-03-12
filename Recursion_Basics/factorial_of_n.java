package Recursion_Basics;

public class factorial_of_n {
    public static int findFactorial(int n){
        // Base case
        if(n == 0){
            return 1;
        }
        int fn_1= findFactorial(n-1);
        int fn= n*fn_1;
        return fn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(findFactorial(n));
    }
    
}
