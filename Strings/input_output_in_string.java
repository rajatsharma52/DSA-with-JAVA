package Strings;

import java.util.Scanner;

public class input_output_in_string {
    public static void main(String[] args) {
        // Take input in string.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name:");
        String name;
        // name= sc.next(); //It takes only one word.
        name= sc.nextLine();
        // Output in string
        System.out.println("Name is:" + name);
    }
    
}
