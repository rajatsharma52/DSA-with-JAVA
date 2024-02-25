package Strings;

public class string_is_palindrome_or_not {
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String str= "racecar";
        System.out.println(isPalindrome(str));

    }
    
}
