package Basic_of_Java;

import java.util.Scanner;


public class num_is_prime_or_not {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        
        
        if( n == 2){
            System.out.println("n is prime");
        }else{
            boolean isPrime= true;
        // for(int i=2; i<=n-1; i++)
           for(int i=2; i<=Math.sqrt(n); i++){

            if(n % i == 0){
                isPrime= false; // n is a multiple of i (i not equal to 1 or n)
            }
        }

         if(isPrime == true){
            System.out.println("n is prime");

         }else{
            System.out.println("n is not prime");
         }
        }

    }
    
}

