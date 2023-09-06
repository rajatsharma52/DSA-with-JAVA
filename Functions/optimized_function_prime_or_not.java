package Functions;

public class optimized_function_prime_or_not {

     public static boolean isPrime(int n){
    // Corner cases
    // Only for n>=2
    // For 2

        if(n==2){
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(30));
        
    }
    
}

    

