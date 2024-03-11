package Recursion_Basics;

public class print_numbers_from_1_to_n {
    public static void printIncreasing(int n){
        // Base case
        if(n == 1){
            System.out.print(1+ " ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=10;
        printIncreasing(n);
    }
}
