package Functions;

public class method_scope {
    
    public static void printS(){

        // Now this gives an error because we define it in a function name printS and used in main function so it gives error.

        //  int s= 45;
        
    }
    

    public static void main(String[] args) {
        
        //It does not gives any error because it first define and then print and used in function in which it is defined.
        // If we first print the define it will gives error.
     
    
        int s= 45;
        System.out.println(s);
        
    }
    
}
