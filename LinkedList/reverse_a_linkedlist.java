package LinkedList;

public class reverse_a_linkedlist {

    public static class Node{
        int data;
        Node next;
    
      public Node(int data){
        this.data= data;
        this.next= null;
      }
    }

    public static Node head;
    public static Node tail;

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

    
    //Method or function for addFirst means add elements at starting of the LINKEDLIST
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

     //Method or function for addLast means add elements at end of the LINKEDLIST
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

    public static void main(String[] args) {
        reverse_a_linkedlist ll= new reverse_a_linkedlist();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMiddle(2, 3);
        ll.printLinkedList();

        //Reverse LINKEDLIST
        ll.reverseLinkedList();

        ll.printLinkedList();
        
    }

    
}
