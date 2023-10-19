package Arrays;

import java.util.*;

public class input_output_updation_in_array {

    public static void main(String[] args) {
        
        // define an array of marks of size 100.

        int marks[]= new int[100];

        // take input of marks of three subjects in this array.

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Physics marks:");
        marks[0]= sc.nextInt();
        System.out.println("Enter Chemistry marks:");
        marks[1]= sc.nextInt();
        System.out.println("Enter Maths marks:");
        marks[2]= sc.nextInt();
        System.out.println();

        // show output of an array.

        System.out.println("Physics marks:" + marks[0]);
        System.out.println("Chemistry marks:" + marks[1]);
        System.out.println("Maths marks:" + marks[2]);

        // If I want to update any marks then I can easily update it by changing its index value.
        // I want to change my maths marks.
        
        System.out.println("Enter the updated Maths marks:");
        marks[2]= sc.nextInt();
        System.out.println("Updated marks of Maths is:" + marks[2]);
    }
    
}
