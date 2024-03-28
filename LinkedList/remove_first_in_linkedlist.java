package LinkedList;

public class remove_first_in_linkedlist {

    //Creating a class for our nodes
    public static class Node{
            int data; //1st part of Node
            Node next; //2nd part of Node
    
            //Creating the constructor
            public Node(int data){
                this.data= data;
                this.next= null;
            }
        }
    
    // Create HEAD and TAIL
         public static Node head;
         public static Node tail;
         public static int size;

    //Method or function for removeFirst means remove elements from starting of the LINKEDLIST
        public int removeFirst(){
            //Base case or Special case
            //Case1: if linkelist is empty
            if(size == 0){
                System.out.println("LinkedList is empty");
                return Integer.MIN_VALUE;
            }
            //Case2: if only one node in linkedlist
            else if(size == 1){
                int val= head.data;
                head = tail = null;
                return val;
            }
            int val= head.data;
            head= head.next;
            return val;
        }
         //Method or function for addFirst means add elements at starting of the LINKEDLIST
    public void addFirst(int data){
        //Step1: crate a new node
        Node newNode= new Node(data);

        //when add an element size ko increase kar do
        size++;

        //Linkedlist is empty and also it is Base case
        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step2: newNode next= head
        newNode.next= head;

        // Step3: head= newNode
        head= newNode;
    }
    //Method or function for print a linkelist
    public void printLinkedList(){
        if(head == null){
            System.out.println("LinkedList is empty");
        }
        Node temp= head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        remove_first_in_linkedlist ll= new remove_first_in_linkedlist();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.printLinkedList();
        ll.removeFirst();
        ll.printLinkedList();
        
    }
    
}
