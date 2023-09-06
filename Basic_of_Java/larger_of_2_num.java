package Basic_of_Java;

import java.util.*;

public class larger_of_2_num {
    public static void main(String args[]){
        System.out.println("Enter the value of A");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println("Enter the value of B");
        int B = sc.nextInt();
        if(A>=B){
            System.out.println("A is greater then B and the value is:" +A);
        
        }
        else{
            System.out.println("B is greater then A and the value is:" +B);
        }
    }
    
}
