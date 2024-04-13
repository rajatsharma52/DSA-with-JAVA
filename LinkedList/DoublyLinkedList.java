package LinkedList;

public class DoublyLinkedList {

    //Creating Node in Doubly LinkedList
    public class Node{
        int data;
        Node next;
        Node prev;

        //Creating constructor for Node
        public Node(int data){
            this.data= data;
            this.next= null;
            this.prev= null;
        }
    }

    //Defining HEAD AND TAIL OF DOUBLY LINKEDLIST
    public static Node head;
    public static Node tail;

    //Defining SIZE variable to calculate the size of DOUBLY LINKEDLIST
    public static int size;

    //Function or method for addFirst in DOUBLY LINKEDLIST
    public void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        //Base case or special case
        //if DOUBLY LINKEDLIST is empty
        if(head == null){
            head= tail= newNode;
            return;
        }
        newNode.next= head;
        head.prev= newNode;
        head= newNode;
    }

    
    //Function or method for addLast in DOUBLY LINKEDLIST
    public void addLast(int data){
        Node newNode= new Node(data);
        size++;
        //Base case or special case
        //if DOUBLY LINKEDLIST is empty
        if(head == null){
            head= tail= newNode;
            return;
        }
        tail.next= newNode;
        newNode.prev= tail;
        tail= newNode;
    }


    //Function or method for print DOUBLY LINKEDLIST
    public void printLinkedList(){
        Node temp= head;
        while (temp != null) {
            
            System.out.print(temp.data+ "<->");
            temp= temp.next;
        }
        System.out.println("null");
    }

    //Function or method for removeFirst in DOUBLY LINKEDLIST

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
        head.prev= null;
        size--;
        return val;
    }

    //Function or method for removeLast in DOUBLY LINKEDLIST
    
    public int removeLast(){
        //Base case or Special case
        //Case1: if linkelist is empty
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        //Case2: if only one node in linkedlist
        else if(size == 1){
            int val= tail.data;
            head = tail = null;
            size= 0;
            return val;
        }
        int val= tail.data;
        tail= tail.prev;
        tail.next= null;
        size--;
        return val;
    }
    public static void main(String[] args) {
         
        //Create a linkelist
        DoublyLinkedList dll= new DoublyLinkedList();

        // Add elements in linkedlist at FIRST position
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        //Print Linkedlist
        dll.printLinkedList();

        //Print Size of Linkedlist
        System.out.println("Size of DOUBLY LINKEDLIST is: "+ dll.size);

        // Add elements in linkedlist at LAST position
        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(6);
        
        dll.printLinkedList();

        System.out.println("Size of DOUBLY LINKEDLIST is: "+ dll.size);

        //Remove element from the FIRST position of linkedlist
        dll.removeFirst();

        dll.printLinkedList();

        System.out.println("Size of DOUBLY LINKEDLIST is: "+ dll.size);

        //Remove element from the LAST position of linkedlist
        dll.removeLast();

        dll.printLinkedList();

        System.out.println("Size of DOUBLY LINKEDLIST is: "+ dll.size);
    }
    
}
