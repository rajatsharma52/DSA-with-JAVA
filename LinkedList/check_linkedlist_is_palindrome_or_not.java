package LinkedList;

public class check_linkedlist_is_palindrome_or_not {

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

        check_linkedlist_is_palindrome_or_not ll= new check_linkedlist_is_palindrome_or_not();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.printLinkedList(); //i.e 1->2->2->1->null

        System.out.println(ll.checkPalindrome());
        
    }
    
}
