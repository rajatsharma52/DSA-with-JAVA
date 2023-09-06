package Basic_of_Java;



public class rev_a_num {
    public static void main(String args[]){
        int n=78374873;
        int rev=0;

        while(n>0){
            int lastDigit= n%10;
            rev= (rev*10) + lastDigit;
            n=n/10;

         
        }
        System.out.println(rev);


    }
    
}


