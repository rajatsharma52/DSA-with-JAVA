package Basic_of_Java;

import java.util.*;

public class pass_fail {
    public static void main(String args[]){
        System.out.println("Enter your marks");
        Scanner sc= new Scanner(System.in);
        int marks = sc.nextInt();

        String result= ((marks>=33))? "PASS": "FAIL";
        System.out.println(result);
    }
    
}
