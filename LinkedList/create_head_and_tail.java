package LinkedList;

public class create_head_and_tail {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }

    // Create HEAD and TAIL
    public static Node head;
    public static Node tail;

    //Methods or Functions for the operations of LINKEDLIST
    //Like add(), remove(), print() and so on.

    public static void main(String[] args) {
        
        // Create a LINKEDLIST
        create_head_and_tail ll= new create_head_and_tail(); // ll= LINKEDLIST

        // Add elements in LINKEDLIST
        ll.head= new Node(1);
        ll.head.next= new Node(2);

        // But in LINKEDLIST we do not directly add, remove, print our linkedlist
        // we create the other METHODS or FUNCTIONS to add, remove, print and so on
        // and we create these methods or function in OUR CLASS.
    }
}