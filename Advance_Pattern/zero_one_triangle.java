package Advance_Pattern;

public class zero_one_triangle {

    public static void zero_one_triangle_func(int n){

        // outer loop
        for(int i=1; i<=n; i++){

            // inner loop
            for(int j=1; j<=i; j++){
                
                // condition for print 1 is: if i+j = even then print 1.

                if((i+j) % 2  == 0){
                    System.out.print("1");
                }
                
                // condition for print 0 is: if i+j = odd then print 0.
                
                else{
                    System.out.print("0");
                }

            }
            System.out.println();
        }
        return;

    }

    public static void main(String[] args) {
        zero_one_triangle_func(5);
        
    }
    
}
