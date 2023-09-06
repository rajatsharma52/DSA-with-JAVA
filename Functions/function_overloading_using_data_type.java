package Functions;

public class function_overloading_using_data_type {

    // Function for add 2 integer numbers.
    public static int sum(int a, int b){
        return a+b;
    }

    // Function for add 2 float numbers.
    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {

        System.out.println(sum(3,4));
        System.out.println(sum(2.5f,2.5f));
        
    }
    
}
