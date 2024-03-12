package Recursion_Basics;

public class fibonacci_number {
    public static int fib(int n){
        // Base case
        if(n == 0 || n == 1){
            return n;
        }
        int fn_1= fib(n-1);
        int fn_2= fib(n-2);
        int fn= fn_1 + fn_2;
        return fn;
    }
    public static void main(String[] args) {
        int n=25;
        System.out.println(fib(n));
    }
    
}
