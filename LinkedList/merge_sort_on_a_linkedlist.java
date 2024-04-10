package LinkedList;

import Strings.strings_basic;

public class merge_sort_on_a_linkedlist {

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

    //Function to find MIDDLE NODE OR MID NODE
    private Node getMid(Node head){
        Node slow= head;
        Node fast= head.next;

        while(fast != null && fast.next != null){
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow;
    }

    //My merge() function to merge the both divided LINKEDLIST
    private Node merge(Node head1, Node head2){
        Node mergedLL= new Node(-1);
        Node temp= mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next= head1;
                head1= head1.next;
                temp= temp.next;
            }
            else{
                temp.next= head2;
                head2= head2.next;
                temp= temp.next;
                
            }
        }
        while (head1 != null) {
            temp.next= head1;
            head1= head1.next;
            temp= temp.next;
            
        }
        while (head2 != null) {
            temp.next= head2;
            head2= head2.next;
            temp= temp.next;
            
        }
        return mergedLL.next; //Final sorted LINKEDLIST

    }

    //Function or method to sort a LINKEDLIST
    public Node mergeSort(Node head){
        //Base case or special case
        //if linkedlist is empty or has one node in linkedlist
        if(head == null || head.next == null){
            return head;
        }

        //Step1- Find middle node
        Node mid= getMid(head);

        //Step-2 Divide the LINKEDLIST in 2 parts right and left and apply mergeSort on the divided linkedlist
        Node rightHead= mid.next;
        mid.next= null;
        Node newLeft= mergeSort(head);
        Node newRight= mergeSort(rightHead);

        //Step3- Merge the both LINKEDLIST
        return merge(newLeft, newRight);
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
        merge_sort_on_a_linkedlist ll= new merge_sort_on_a_linkedlist();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printLinkedList();

        //Applying merge sort on LINKEDLIST
        ll.head= ll.mergeSort(ll.head);
        ll.printLinkedList();
    }
}