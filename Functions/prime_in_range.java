package Functions;

public class prime_in_range {

    public static boolean isPrime(int n){
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

    public static void PrimeinRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
        return;
    }
    

    public static void main(String[] args) {
       PrimeinRange(10);
    }
    
}
