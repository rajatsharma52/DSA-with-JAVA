package Basic_of_Java;
import java.util.*;

public class if_else_basic {
    public static void main(String args[]){
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are adult");
        }
            else{
                System.out.println("You are not adult");
            }
        


    }
    
}
