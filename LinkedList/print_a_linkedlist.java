package LinkedList;

public class print_a_linkedlist {
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

       //Method or function for addFirst
       public void addFirst(int data){
        //Step1: crate a new node
        Node newNode= new Node(data);

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
     //Method or function for addLast
     public void addLast(int data){

        //Step1: ceate a new node
        Node newNode= new Node(data);

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

    public static void main(String[] args) {
        print_a_linkedlist ll= new print_a_linkedlist();
        ll.printLinkedList();
        ll.addFirst(2);
        ll.printLinkedList();
        ll.addFirst(1);
        ll.printLinkedList();
        ll.addLast(3);
        ll.printLinkedList();
        ll.addLast(4);
        ll.printLinkedList();
    }
    
}
