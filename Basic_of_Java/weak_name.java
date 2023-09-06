package Basic_of_Java;

import java.util.*;

public class weak_name {
    public static void main(String args[]){
        System.out.println("Enter your num: ");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();

        switch(num){
            case 1: System.out.println("Day is Monday");
                    break;
            case 2: System.out.println("Day is Tuesday");
                    break;
            case 3: System.out.println("Day is Wednesday");
                    break;
            case 4: System.out.println("Day is Thursday");
                    break;
            case 5: System.out.println("Day is Friday");
                    break;
            case 6: System.out.println("Day is Saturday");
                    break;
            case 7: System.out.println("Day is Sunday");
                    break;
            default: System.out.println("Enter a wrong choice");
        }
    }
    
}
