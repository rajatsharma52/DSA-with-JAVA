package Basic_of_Java;

import java.util.*;

public class factorial_loop {
    public static void main(String[] args) {
        System.out.println("Enter the postive value of n: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int fact=1;

        for(int i=1; i<=n; i++){
            fact= fact*i;
        }
        System.out.println("Factorial of your number is:" +fact);
    }
    
}
