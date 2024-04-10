package LinkedList;
import java.util.LinkedList;

public class linkedlist_in_java_collection_framework {
    public static void main(String[] args) {
        
        //Create a LINKEDLIST
        LinkedList<Integer> ll= new LinkedList<>();

        //Add in LINKEDLIST
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        //Printing the LINKEDLIST
        System.out.println(ll);

        //Remove in LINKEDLIST
        ll.removeLast();
        ll.removeFirst();

        System.out.println(ll);
    }
    
}
