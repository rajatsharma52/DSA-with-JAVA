package Basic_of_Java;

import java.util.*;

public class sum_two_num_user_input {
    public static void main(String args[]){
        System.out.println("Enter first number");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("Enter second number");
        int b= sc.nextInt();
        int sum= a+b;
        System.out.println("The sum of a and b is:" +sum);

    }
    
}


