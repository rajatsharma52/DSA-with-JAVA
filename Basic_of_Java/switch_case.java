package Basic_of_Java;

import java.util.*;

public class switch_case {
    public static void main(String args[]){
        System.out.println("Enter a num");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();

        switch(num){
            
            case 1 : System.out.println("Samosa");
                    break;
            case 2 : System.out.println("Burger");
                     break;
            case 3 : System.out.println("Pizza");
                     break;

            default : System.out.println("We realize we are dreaming");
        }
        
    }
    
}
