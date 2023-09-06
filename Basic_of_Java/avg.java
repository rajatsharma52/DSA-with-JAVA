package Basic_of_Java;

import java.util.*;

public class avg {
    public static void main(String args[]){
        System.out.println("Enter the value of A");
        Scanner sc= new Scanner(System.in);
        int A= sc.nextInt();
        System.out.println("Enter the value of B");
        int B= sc.nextInt();
        System.out.println("Enter the value of C");
        int C= sc.nextInt();
        int avg= (A+B+C)/3;
        System.out.println("Avg of A,B and C is:" +avg);
    }
}
