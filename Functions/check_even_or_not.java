package Functions;

public class check_even_or_not {

    public static int isEven(int n){
        if(n%2==0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        return n;
    }

    public static void main(String[] args) {

        isEven(4);
        
    }
    
}
