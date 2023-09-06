package Functions;

public class num_prime_or_not_func {

    public static boolean isPrime(int n){
    // Corner cases
    // Only for n>=2
    // For 2

        if(n==2){
            return true;
        }

        for(int i=2; i<=n-1; i++){
            if(n % i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(15));
        
    }
    
}
