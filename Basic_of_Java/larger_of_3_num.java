package Basic_of_Java;

import java.util.*;

public class larger_of_3_num {
    public static void main(String args[]){
        System.out.println("Enter the value of A");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println("Enter the value of B");
        int B= sc.nextInt();
        System.out.println("Enter the value of C");
        int C= sc.nextInt();
        if((A>=B)&&(A>=C)){
            System.out.println("A is greatest and the value is:" +A);
        }
        else if(B>=C){
            System.out.println("B is greatest and the value is:" +B);
        }
        else{
            System.out.println("C is greatest and the value is:" +C);
        }
    }
}
