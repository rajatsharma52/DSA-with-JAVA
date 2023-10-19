package Arrays;

import java.util.Scanner;

public class find_percentage_of_marks {

    public static void main(String[] args) {
         int marks[]= new int[100];

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Physics marks:");
        marks[0]= sc.nextInt();
        System.out.println("Enter Chemistry marks:");
        marks[1]= sc.nextInt();
        System.out.println("Enter Maths marks:");
        marks[2]= sc.nextInt();
        System.out.println();

        System.out.println("Physics marks:" + marks[0]);
        System.out.println("Chemistry marks:" + marks[1]);
        System.out.println("Maths marks:" + marks[2]);

        int percentage= (marks[0] + marks[1] + marks[2]) / 3;

        System.out.println("Percentage is :" + percentage + "%");
    }
    
}
