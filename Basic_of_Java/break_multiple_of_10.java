package Basic_of_Java;

import java.util.Scanner;

public class break_multiple_of_10 {
    public static void main(String args[]){
        
        Scanner sc= new Scanner(System.in);
        
        do{
            System.out.println("Enter the value of n");
            int n= sc.nextInt();

            if(n%10==0){
                break;
            }
            System.out.println(n);

        }while(true);


       
    }
    
}

