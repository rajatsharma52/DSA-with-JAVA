package Basic_of_Java;

import java.util.Scanner;

public class reverse_of_a_num {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.err.println("Enter n");
        int n= sc.nextInt();


        while(n>0){
            int lastDigit= n%10;
            
            System.out.print(lastDigit);
            n= n/10;
        }
        System.err.println();

        }
        
    
}

