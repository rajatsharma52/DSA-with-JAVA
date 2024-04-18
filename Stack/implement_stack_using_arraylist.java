package Stack;

import java.util.ArrayList;
public class implement_stack_using_arraylist {

    static class Stack{

        //Creating a ARRAYLIST
        static ArrayList<Integer> list= new ArrayList<>();

        //isEmpty() function to check STACK IS EMPTY OR NOT
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //PUSH OPERATION
        public static void push(int data){
            list.add(data);
        }

        //POP OPERATION
        public static int pop(){
            //Base case, if STACK IS EMPTY
            if(isEmpty()){
                return -1;
            }
            int top= list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //PEEK OPERATION
        public static int peek(){
            //Base case, if STACK IS EMPTY
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }


    public static void main(String[] args) {
        //Creating a STACK
        Stack s= new Stack();

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
