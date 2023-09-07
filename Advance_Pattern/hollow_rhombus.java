package Advance_Pattern;

public class hollow_rhombus {

    public static void rhombus(int n){

        // outer loop
        for(int i=1; i<=n; i++){

            // inner loop

            // spaces= (n-i)
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // hollow rectangle for print stars and its final result gives us as hollow rhombus.
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1|| j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return;
    }

    public static void main(String[] args) {
        rhombus(5);
        
    }
    
}
