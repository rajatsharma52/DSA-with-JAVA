package Advance_Pattern;

public class inverted_half_pyramid_with_numbers {

    public static void inv_half_pyaramid_num(int n){

        // outer loop
        for(int i=1; i<=n; i++){

            // inner loop
            for (int j=1; j<= (n-i+1); j++) {
                System.out.print(j + " ");
                
            }
            System.out.println();
        }
        return;
    }

    public static void main(String[] args) {
        inv_half_pyaramid_num(5);
        
    }
    
}
