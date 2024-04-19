package Stack;

import java.util.*;
public class push_element_at_bottom_of_stack {

    public static void pushAtBottom(Stack<Integer> s, int data){
        //Base case, if STACK IS EMPTY
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        //Upar jate time elements ko STACK SE REMOVE or POP KRENGE
        int top= s.pop();

        //Recursive call for other elements
        pushAtBottom(s, data);

        //Ab neeche aate time jo elements ko POP kiya tha ab unko PUSH or ADD KRENGE
        s.push(top); 
    }

    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}