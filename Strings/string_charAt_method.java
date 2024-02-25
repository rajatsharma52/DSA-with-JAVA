package Strings;

public class string_charAt_method {
    // function to print all the symbols of string
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String fullName= "Rajat Sharma";
        // print the symbol of desired index.
        System.out.println(fullName.charAt(0));
        printLetters(fullName);
    }
    
}
