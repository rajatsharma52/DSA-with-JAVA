package Functions;

public class decimal_to_binary {

    public static void decToBin(int n){
        
        int myNum= n;
        int pow= 0;
        int binNum= 0;

        while(n>0){
            int remainder= n%2;

            binNum= binNum + (remainder*(int)Math.pow(10, pow));
            pow++;
            n= n/2;
        }
        System.out.println("binary form of " + myNum + " = " + binNum);
        return;
    }
     public static void main(String[] args) {
        decToBin(7);
        
    }
    
}
