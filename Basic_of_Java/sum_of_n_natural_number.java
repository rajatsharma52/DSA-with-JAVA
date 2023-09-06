package Basic_of_Java;

import java.util.*;

public class sum_of_n_natural_number {
    public static void main(String args[]){
        System.out.println("Enter the value of n");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int sum= 0;

        int i=1;

        while(i<=n){
            sum= sum+i;
            i++;
        }
        System.out.println("sum is:" +sum);


    }
    
}
