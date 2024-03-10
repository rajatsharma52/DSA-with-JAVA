package Recursion_Basics;

public class print_numbers_form_n_to_1 {
    public static void printDec(int n){
        // Base case
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.print(n+ " ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        printDec(n);
    }
    
}
