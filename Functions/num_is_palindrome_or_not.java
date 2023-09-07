package Functions;
import java.util.*;
public class num_is_palindrome_or_not {
public static void main(String args[]) {

    int n, s=0;
    System.out.println("Enter the value of n:");
    Scanner sc= new Scanner(System.in);
    n= sc.nextInt();

   int c=n;

    while(n>0){
       int r= n%10;
        s= (s*10)+r; //Find palindrome number.
        n= n/10;
    }
    if(c==s){
        System.out.println("Number is Palindrome");
    }
    else{
        System.out.println("Number is not Palindrome");
    }

}
}
