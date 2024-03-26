package LinkedList;

public class add_first_in_linkedlist {
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

    //Method for addFirst
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
    public static void main(String[] args) {

        //Create a linkelist
        add_first_in_linkedlist ll= new add_first_in_linkedlist();

        // Add elements in linkedlist
        ll.addFirst(1);
        ll.addFirst(2);
        System.out.println(ll);
    }
    
}
