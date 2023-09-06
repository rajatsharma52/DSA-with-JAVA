package Functions;

public class swap_func {
    public static void swap(int a, int b){
        int temp= a;
        a= b;
        b= temp;
        System.out.println("a is = " + a);
        System.out.println("b is = " + b);
        return;
    }
    public static void main(String[] args) {
        int a= 5;
        int b= 16;
        swap(a,b);

    }
    
}
