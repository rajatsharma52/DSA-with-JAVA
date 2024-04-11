package LinkedList;

public class zig_zag_linkedlist {

    
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

    //Method or function for zigzag linkedlist
    public void zigZag(){
        //Step1- Find mid node
        Node slow= head;
        Node fast= head.next;

        while(fast != null && fast.next != null){
            slow= slow.next;
            fast= fast.next.next;
        }
        Node mid= slow;

        //Step2- Reverse the 2nd half of linkedlist
        Node curr= mid.next;
        mid.next= null; //It divides our linkedlist in 2 parts
        Node prev= null;
        Node next;
        while (curr != null) {
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }

        //Step3- Alternate merge or ZIG ZAG MERGE
        Node left= head; //i.e left head
        Node right= prev; //i.e right head
        Node nextL, nextR;

        while (left != null && right != null) {
            //Steps of ZIG ZAG MERGE
            nextL= left.next;
            left.next= right;
            nextR= right.next;
            right.next= nextL;

            //Updating the pointers
            left= nextL;
            right= nextR;
        }
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
    public static void main(String[] args) {
        zig_zag_linkedlist ll= new zig_zag_linkedlist();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.printLinkedList(); //i.e 1->2->3->4->5->null
        ll.zigZag();
        ll.printLinkedList(); //i.e 1->5->2->4->3->null
    }
    
}
