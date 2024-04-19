package Stack;

import java.util.*;
public class implement_stack_using_java_collection_framework {

    public static void main(String[] args) {
        
        //Creating a Stack with all operations using JAVA COLLECTION FRAMEWORK
        Stack<Integer> s= new Stack<>();

        //Push elements into STACK
        s.push(1);
        s.push(2);
        s.push(3);

        //Printing the STACK VALUES OR printing the STACK
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
