package Basic_of_Java;

import java.util.*;



public class calculator {
    public static void main(String args[]){
        System.out.println("Enter the value of a");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b= sc.nextInt();

        System.out.println("Enter the symbol");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.println(a+b);
                    break;

            case '-' : System.out.println(a-b);
                       break;
            case '*' : System.out.println(a*b);
                       break;
            case '/' : System.out.println(a/b);
                       break;
            case '%' : System.out.println(a%b);
                       break;
            default : System.out.println("Wrong Choice");

        }

        
        }

        
    
    
}
