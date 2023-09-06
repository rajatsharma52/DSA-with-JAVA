package Basic_of_Java;


import java.util.*;
public class num_positive_negative{
    public static void main(String args[]){
        System.out.println("Enter the number:");
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        if(number>=0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is negative");
        }

    }
}
