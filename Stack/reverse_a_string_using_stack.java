package Stack;

import java.util.*;
public class reverse_a_string_using_stack {

    public static String reverseString(String str){
        Stack<Character> s= new Stack<>();

        int index= 0; //Ye index ek ek karke hmare characters par jayega

        //Push all the characters into STACK
        while(index < str.length()){
            s.push(str.charAt(index));
            index++;
        }

        //Creating a string builder which store our resultant string(reversed string)
        StringBuilder result= new StringBuilder("");

        //Pop all the characters from string and add it to result string builder
        while (!s.isEmpty()) {
            char curr= s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str= "abc";
        String result= reverseString(str);
        System.out.println(result);
    }
    
}
