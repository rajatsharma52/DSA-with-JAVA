package Stack;

import java.util.*;
public class reverse_a_stack {

    //Function for PUSH ELEMENTS AT BOTTOM OF STACK
    public static void pushAtBottom(Stack<Integer> s, int data){
        //Base case, if stack is empty
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top= s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    //Function for REVERSE A STACK
    public static void reverseStack(Stack<Integer> s){
        //Base case, if stack is empty
        if(s.isEmpty()){
            return;
        }

        //POP the elements
        int top= s.pop();

        //recursive call for other elements
        reverseStack(s);

        //PUSH the elements at BOTTOM
        pushAtBottom(s, top);
    }

    //Function for PRINT THE STACK
    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3); //3,2,1 are STACK ELEMENTS BEFORE REVERSE

        //REVERSE THE STACK
        reverseStack(s);

        //PRINT THE STACK AFTER REVERSE
        printStack(s); //1,2,3 are STACK ELEMENTS AFTER REVERSE
    }
    
}
