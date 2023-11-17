package Strings;

public class string_function_compare {
    public static void main(String[] args) {
        String s1= "Rajat";
        String s2= "Rajat";
        String s3= new String("Rajat");

        // First we compare the strings with our (==) method.
        if(s1 == s2){
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings are not equal");
        }

        if(s1 == s3){
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings are not equal");
        }

        // Now we compare the strings with (.equals()) function.
        
        if(s1.equals(s2)){
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings are not equal");
        }
    }
    
}
