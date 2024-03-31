package LinkedList;

public class remove_last_in_linkedlist {

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

      //Method or function for removeLast means remove elements from last of the LINKEDLIST
     public int removeLast(){

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

         //Finding previous index(i)= size-2
         Node prev= head;
         for(int i=0; i<size-2; i++){
            prev= prev.next;
         }

         //Now applying the steps of removeLast
         int val= prev.next.data;
         prev.next= null;
         tail= prev;
         return val;
     }
     
     //Method or function for addLast means add elements at end of the LINKEDLIST
     public void addLast(int data){

        //Step1: ceate a new node
        Node newNode= new Node(data);

        //when add an element size ko increase kar do
        size++;

        //Base case or special case
        //if LINKEDLIST is empty
        if(head == null){
            head= tail= newNode;
            return;
        }

        //Step2: tail.next= newNode
        tail.next= newNode;

        //Step3: tail= newNode
        tail= newNode;
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
        remove_last_in_linkedlist ll= new remove_last_in_linkedlist();
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printLinkedList();

        ll.removeLast();
        ll.printLinkedList();
    }
    
}
