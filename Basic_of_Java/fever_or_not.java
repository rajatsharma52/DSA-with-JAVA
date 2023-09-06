package Basic_of_Java;

import java.util.*;

import javax.security.sasl.SaslClientFactory;

public class fever_or_not {
    public static void main(String args[]){
        System.out.println("Enter your temp");
        Scanner sc= new Scanner(System.in);
        double temp= sc.nextDouble();
        if(temp>100){
            System.out.println("You have fever");
        }
        else{
            System.out.println("You have no fever");
        }
    }
    
}
