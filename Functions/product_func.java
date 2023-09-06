package Functions;

public class product_func {

    public static int multiply(int a, int b){
        int product= a*b;
        return product;

    }
    public static void main(String[] args) {
        int a= 6;
        int b= 10;

        int prod= multiply(a, b);
        System.out.println("The product is:" + prod);
        
    }
    
}
