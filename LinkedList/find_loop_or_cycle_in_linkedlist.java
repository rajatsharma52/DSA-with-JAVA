package LinkedList;

public class find_loop_or_cycle_in_linkedlist {

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
        head.next= new Node(2);
        head.next.next= new Node(3);
        head.next.next.next= head;

        //Our LINKEDLIST IS LIKE
        //1->2->3->1

        System.out.println(isCycle());
    }
    
}

