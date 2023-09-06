package Basic_of_Java;

import java.util.*;

public class area_of_circle {
    public static void main(String args[]){
        System.out.println("Enter the value of r");
        Scanner sc= new Scanner(System.in);
        float r= sc.nextFloat();
        float area= 3.14f*r*r;
        System.out.println("Area of a circle is:" +area);

    }
    
}

