package Basic_of_Java;
import java.util.*;

public class num_1_to_n {
    public static void main(String args[]){
        System.out.println("Enter the value of n");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int i= 1;

        while(i<=n){
            System.out.println(i);
            i++;
        }

    }
    
}
