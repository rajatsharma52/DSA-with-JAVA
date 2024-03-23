package Basic_of_Java;
public class swap_two_num_without_using_temp {

    public static void main(String[] args) {
        int a= 10;
        int b= 30;
        // a= a + b;
        // b= a-b;
        // a= a-b;
        a= a^b;
        b= a^b;
        a= a^b;
        System.out.println("a= " + a);
        System.out.println("b=" + b);
    }
}