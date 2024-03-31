package LinkedList;

public class search_in_linkedlist_recursive_method {

    
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

     //Helper function for search our key because we change our HEAD in recursive calls
     //so we create a helper function
     public int helper(Node head, int key){

        //Base case
        if(head == null){
            return -1;
        }

        if(head.data == key){//Key found
            return 0;
        }

        int index= helper(head.next, key); // It search in next level
        if(index == -1){//Key not found in next level
            return -1;
        }

        return index+1;
     }

     //Recursive function to search our KEY with calls HELPER function
     public int recursiveSearch(int key){
        return helper(head, key);
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
        search_in_linkedlist_recursive_method ll= new search_in_linkedlist_recursive_method();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printLinkedList();

        System.out.println(ll.recursiveSearch(3));
        System.out.println(ll.recursiveSearch(10));
    }
    
}
