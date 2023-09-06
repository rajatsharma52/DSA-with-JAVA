package Functions;
import java.util.*;

public class sum_func {

    public static int calculateSum(int num1, int num2){
        int sum= num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a= sc.nextInt();
        System.out.println("Enter the value of b:");
        int b= sc.nextInt();
        int sum= calculateSum(a, b);
        System.out.println("The sum of a and b is:" + sum);
    }
    
}
