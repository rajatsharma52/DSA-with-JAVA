package Basic_of_Java;

import java.util.Scanner;

public class except_multiple_10 {
    public static void main(String args[]){
        
        Scanner sc= new Scanner(System.in);
        
        do{
            System.out.println("Enter the value of n");
            int n= sc.nextInt();

            if(n%10==0){
                continue;
            }
            System.out.println(n);

        }while(true);


       
    }
    
}

