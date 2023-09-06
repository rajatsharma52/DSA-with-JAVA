package Basic_of_Java;

import java.util.*;

public class product_2_num {
    public static void main(String args[]){
        System.out.println("Enter First Number");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("Enter Second Number");
        int b= sc.nextInt();
        int product= a*b;
        System.out.println("The product of a and b is:" +product);
    }

}
