package Advance_Pattern;

public class inverted_half_pyramid {

    public static void inv_half_pyaramid(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            
            // inner loop

            // for spaces
            for(int j=1; j<=(4-i); j++){
                System.out.print(" ");
            }
            // for stars
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
    
        }
        return;
    }

    public static void main(String[] args) {
        inv_half_pyaramid(4);
        
    }
    
}
