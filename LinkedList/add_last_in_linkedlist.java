package LinkedList;

public class add_last_in_linkedlist {
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

        //Create linkedlist
        add_last_in_linkedlist ll= new add_last_in_linkedlist();

        //Add elements at LAST position of linkedlist
        ll.addLast(3);
        ll.addLast(4);
        
    }
    
}
