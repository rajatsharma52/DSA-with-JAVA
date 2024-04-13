package LinkedList;

public class reverse_a_doubly_linkedlist {

    
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

    //Function or method to REVERSE a DOUBLY LINKEDLIST
    public void reverse(){
        Node curr= head;
        Node prev= null;
        Node next;

        while (curr != null) {
            next= curr.next;
            curr.next= prev;
            curr.prev= next;

            prev= curr;
            curr= next;
        }
        head= prev;
    }

    
    //Function or method for addFirst in DOUBLY LINKEDLIST
    public void addFirst(int data){
        Node newNode= new Node(data);
        
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

    
    //Function or method for print DOUBLY LINKEDLIST
    public void printLinkedList(){
        Node temp= head;
        while (temp != null) {
            
            System.out.print(temp.data+ "<->");
            temp= temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        reverse_a_doubly_linkedlist dll= new reverse_a_doubly_linkedlist();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.printLinkedList();

        dll.reverse();

        dll.printLinkedList();
    }
    
}
