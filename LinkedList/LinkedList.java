package LinkedList;

//In this file I do complete operations of LinkedList like addFirst(), 
// addLast(), print(), remove() and so on.

public class LinkedList {

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

     //Create size variable to calculate the size of LINKEDLIST
     public static int size;

    //Methods or Functions for the operations of LINKEDLIST
    //Like add(), remove(), print() and so on.

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

       //Method or function for addMiddle means add elements at any index of the LINKEDLIST
       public void addMiddle(int index, int data){
        
        // Base case or special case
        if(index == 0){
            addFirst(data);
            return;
        }

        Node newNode= new Node(data);

        //when add an element size ko increase kar do
        size++;
        Node temp= head;
        int i=0; // i tracks the index of our temp

        //Finding the previous index
        while(i < index-1){
            temp= temp.next;
            i++;
        }

        //i= index-1 i.e temp point -> our previous index
        newNode.next= temp.next;
        temp.next= newNode;
      }
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
            size= 0;
            return val;
        }
        int val= head.data;
        head= head.next;
        size--;
        return val;
    }

    
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
            size= 0;
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
         size--;
         return val;
     }

     
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

     
    //Method or function to REVERSE A LINKEDLIST
    public static void reverseLinkedList(){
        Node prev= null;
        Node curr= tail= head;
        Node next;

        while(curr != null){

            //Step1
            next= curr.next;

            //Step2
            curr.next= prev; // Reverse step

            //Step3
            prev= curr;

            //Step4
            curr= next;
        }
        head= prev;
    }

    
    //Method or function for find & remove nth node from the end of linkedlist
    public void deleteNthfromEnd(int n){

        //Calculate the size of linkedlist
        int size= 0;
        Node temp= head;
        while(temp != null){
            temp= temp.next;
            size++;
        }

        //Base case or special case
        //if the deleting node is head node
        if(n == size){
            head= head.next; //remove first
            return;
        }

        //Find previous index i.e size-n
        int i=1;
        Node prev= head;
        while(i < size-n){
            prev= prev.next;
            i++;
        }

        //Deleting the Nth node from the last
        prev.next= prev.next.next;
        return;
    }

    
    //Method or function for find the MIDNODE of a LINKEDLIST
    //using SLOW-FAST APPROACH

    public Node findMidNode(Node head){
        Node slow= head;
        Node fast= head;

        while(fast !=null && fast.next != null){
            slow = slow.next; //i.e slow= slow+1;
            fast= fast.next.next; //i.e fast= fast+2;
        }

        return slow; // Slow is my MIDNODE.
    }

    //Method or function to check if a LINKEDLIST IS PALINDROME OR NOT
    public boolean checkPalindrome(){
        //Base case or special case
        //if linkedlist is empty or has only one node
        if(head == null || head.next == null){
            return true; //i.e LINKEDLIST IS PALINDROME
        }

        //Step-1 find mid node
        Node midNode= findMidNode(head); //we are using our find mid node function to find mid node

        //Step-2 reverse the 2nd half of linkedlist
        Node prev= null;
        Node curr= midNode;
        Node next;

        while(curr != null){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }

        //Step-3 check 1st half and 2nd half of LINKEDLIST
        Node right= prev; //i.e 2nd half HEAD of LINKEDLIST
        Node left= head; //i.e 1st half HEAD of LINKEDLIST

        while(right != null){
            if(left.data != right.data){//Condition for not palindrome
                return false;
            }
            left= left.next; //i.e left++;
            right= right.next; //i.e right--;
        }

        return true;
    }

    public static void main(String[] args) {

        //Create a linkelist
        LinkedList ll= new LinkedList();

        //Print linkedlist
        ll.printLinkedList();

        // Add elements in linkedlist at FIRST position
        ll.addFirst(2);
        //Print linkedlist
        ll.printLinkedList();

        ll.addFirst(1);
        //Print linkedlist
        ll.printLinkedList();


        //Add elements at LAST position of linkedlist
        ll.addLast(3);
        //Print linkedlist
        ll.printLinkedList();
        
        ll.addLast(4);
        //Print linkedlist
        ll.printLinkedList();

        //Add element at MIDDLE position of LinkedList
        ll.addMiddle(2, 9);
        //Print linkedlist
        ll.printLinkedList();

        //print the size of linkedlist
        System.out.println("Size of LINKEDLIST IS: " + ll.size);

        //Remove element from the FIRST position of linkedlist
        ll.removeFirst();
        //Print linkedlist
        ll.printLinkedList();

        //print the size of linkedlist
        System.out.println("Size of LINKEDLIST IS: " + ll.size);

        ll.removeLast();
        //Print linkedlist
        ll.printLinkedList();

        
        //print the size of linkedlist
        System.out.println("Size of LINKEDLIST IS: " + ll.size);

        //Search for keys in linkedlist by iterative method
        System.out.println("Index of our key is: " + ll.iterativeSearch(3));
        System.out.println("Index of our key is: " + ll.iterativeSearch(20));

        //Search for keys in linkedlist by recursive method
        System.out.println("Index of our key is: " + ll.recursiveSearch(9));
        System.out.println("Index of our key is: " + ll.recursiveSearch(15));

        ll.printLinkedList();

        //Reverse the LINKEDLIST
        ll.reverseLinkedList();
        ll.printLinkedList();

        //Delete the Nth node from last
        ll.deleteNthfromEnd(2);

        ll.printLinkedList();

        // Checking IF A LINKEDLIST IS PALINDROME OR NOT
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        // ll.printLinkedList(); //i.e 1->2->2->1->null

        // System.out.println(ll.checkPalindrome());


    }
    
}
