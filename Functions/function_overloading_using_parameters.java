package Functions;

public class function_overloading_using_parameters {


    // Function to calculate sum of 2 numbers.
    public static int sum(int a, int b){
        return a+b;
    }

    // Function to calculate sum of 3 numbers.
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {

        System.out.println(sum(3,4));

       System.out.println( sum(5,6,1));


        
    }
    
}
