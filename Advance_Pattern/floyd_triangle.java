package Advance_Pattern;

public class floyd_triangle {

    public static void floyd_triangle_func(int n){

        int counter= 1;

        // outer loop
        for(int i=1; i<=n; i++){

            // inner loop- how times counter will printed.

            for(int j=1; j<=i; j++){
                System.out.print(counter+ " ");
                counter++;
            }
          
            System.out.println();
        }
        return;
  
    }

    public static void main(String[] args) {
        floyd_triangle_func(5);
        
    }
    
}
