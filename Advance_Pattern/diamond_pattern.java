package Advance_Pattern;


public class diamond_pattern{

    public static void diamond(int n){

        // upper part or 1st half

        // outer loop
        for(int i=1; i<=n; i++){

            // inner loop
            
            // spaces= (n-i)
            for(int j=1; j<= n-i; j++){
                System.out.print(" ");
            }

            // stars= (2*i-1)
            for(int j=1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // lower part or 2nd half

        // outer loop
        for(int i=n; i>=1; i--){

            // inner loop

            // spaces= (n-i)
            for(int j=1; j<= n-i; j++){
                System.out.print(" ");
            }
            
            // stars= (2*i-1)
            for(int j=1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return;
    }
     

    public static void main(String[] args) {
        diamond(4);
        
    }
}