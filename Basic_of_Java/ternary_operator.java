package Basic_of_Java;

import java.util.*;

public class ternary_operator {
    public static void main(String args[]){
        System.out.println("Enter a num");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();

        String type= ((num%2==0))?"EVEN":"ODD";
        System.out.println(type);

    }
    
}
