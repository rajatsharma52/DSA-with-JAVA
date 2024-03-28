package LinkedList;

import javax.xml.crypto.Data;

public class add_middle_in_linkedlist {
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
        add_middle_in_linkedlist ll= new add_middle_in_linkedlist();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLinkedList();
        ll.addMiddle(1, 9);
        ll.printLinkedList();
        
    }

    
}