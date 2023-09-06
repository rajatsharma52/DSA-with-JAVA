package Functions;

public class block_scope {

    public static void main(String[] args) {

        // If I make a variable here then I can use it in below both area due to its starting and ending position.
        int s= 10;
    
        {
            // We can use this variable in this block does not gives any error.

            int n= 3;
            System.out.println(n);
            System.out.println(s);
        }

        // If we use this variable in other block it gives error.
        
        // System.out.println(n);
        System.out.println(s);
    }
    
}
