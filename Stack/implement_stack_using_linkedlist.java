package Stack;

import java.util.*;
public class implement_stack_using_linkedlist {

    // Creating a NODE CLASS
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next= null;
        }
    }

    static class Stack{

        //Creating HEAD NODE
        static Node head= null;

        
        //isEmpty() function to check STACK IS EMPTY OR NOT
        public static boolean isEmpty(){
            return head == null;
        }

        //PUSH OPERATION
        public static void push(int data){
            Node newNode= new Node(data);
            
            //Base case, if STACK IS EMPTY
            if(isEmpty()){
                head= newNode;
                return;
            }
            newNode.next= head;
            head= newNode;
        }

        //POP OPERTION
        public static int pop(){
                        
            //Base case, if STACK IS EMPTY
            if(isEmpty()){
                return-1;
            }
            int top= head.data;
            head= head.next;
            return top;
        }

        //PEEK OPERATION
        public static int peek(){
                                    
            //Base case, if STACK IS EMPTY
            if(isEmpty()){
                return-1;
            }

            return head.data;
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
