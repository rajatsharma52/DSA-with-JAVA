package Basic_of_Java;

import java.util.*;

public class arithmetic_operator_binary {
    public static void main(String args[]){
        System.out.println("Enter first number");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("Enter second number");
        int b= sc.nextInt();
        //Arithmetic Operatos
        int sum= a + b;
        System.out.println(sum);
        int sub= a - b;
        System.out.println(sub);
        int product= a * b;
        System.out.println(product);
        int div= a/b;
        System.out.println(div);
        int modulo= a % b;
        System.out.println(modulo);



    }
    
}
