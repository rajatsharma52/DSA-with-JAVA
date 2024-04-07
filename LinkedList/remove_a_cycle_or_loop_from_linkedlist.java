package LinkedList;

public class remove_a_cycle_or_loop_from_linkedlist {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next= next;
        }
    }

    public static Node head;
    public static Node tail;

    //Method or function to remove a CYCLE FROM LINKEDLIST

    public static void removeCycle(){

        //Step1- Detect or find cycle
        Node slow= head;
        Node fast= head;

        boolean cycle= false;

        while(fast != null && fast.next != null){
            slow= slow.next;
            fast= fast.next.next;

            if(slow == fast){
                cycle= true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        //Step2- Find meeting point i.e lastNode
        slow= head;
        Node prev= null; // It stores last node
        while(slow != fast){
            prev= fast;
            slow= slow.next;
            fast= fast.next;
        }

        //Step-3 remove cycle i.e lastNode.next= null
        prev.next= null;  //Because our lastnode is in prev.
    }

    
    //Method or function for finding the loop/cycle in a LINKEDLIST
    //We are using FLOYD'S CYCLE FINDING ALGORITHM

    public static boolean isCycle(){
        Node fast= head;
        Node slow= head;

        while(fast != null && fast.next != null){//Condition of a normal linkedlist without cycle

            slow= slow.next; //i.e +1;
            fast= fast.next.next; //i.e +2;

            if(slow == fast){  //Condition for cycle exist
                return true;
            }

        }
        return false; //Cycle does not exist;
    }
    public static void main(String[] args) {
        head= new Node(1);
        Node temp= new Node(2);
        head.next= temp;
        head.next.next= new Node(3);
        head.next.next.next= temp;

        //Our linkedlist is looks likes as
        //1->2->3->2

        //First we check there is cycle or not in our linkedlist
        System.out.println(isCycle());

        //If there is cycle we remove it
        removeCycle();

        //Now again check there is cycle or not
        System.out.println(isCycle());


    }
    
}
