package Basic_of_Java;
public class logical_operator {
    public static void main(String args[]){
        int a = 10;
        int b= 5;
        // Logical Operators
        System.out.println((a>b) && (b<a)); /* If both statements are 
        true then print true otherwise false */
        System.out.println((a<b)||(b>a));/* If both statements are
        false then print false otherwise true */
        System.out.println(!(a<b)); /* If the statement is true it
        change it to false and if the statement is false
        it changes to true */

    }
    
}
