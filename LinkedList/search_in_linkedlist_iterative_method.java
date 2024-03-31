package LinkedList;

public class search_in_linkedlist_iterative_method {

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

     //Method or function for search for a KEY in linkedlist by iterative method
     public int iterativeSearch(int key){
        Node temp= head;
        int index= 0;

        while (temp != null) {
            if(temp.data == key){ // KEY FOUND
                return index;
            }
            temp= temp.next;
            index++;
        }

        //KEY NOT FOUND
        return -1;
     }

     
    //Method or function for addFirst means add elements at starting of the LINKEDLIST
    public void addFirst(int data){
        //Step1: crate a new node
        Node newNode= new Node(data);

        //when add an element size ko increase kar do
      

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
        search_in_linkedlist_iterative_method ll= new search_in_linkedlist_iterative_method();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.printLinkedList();

        System.out.println(ll.iterativeSearch(3));
        System.out.println(ll.iterativeSearch(8));
    }
    
}
