package Strings;

public class substrings {

    public static String printsubString(String str, int si, int ei){
        String substr= "";
        for(int i= si; i<ei; i++){
            substr+= str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str= "RajatSharma";
        System.out.println(printsubString(str, 0, 5));
        // There is a inbuilt function in java to print the substring.
        System.out.println(str.substring(0,5));
    }
    
}
