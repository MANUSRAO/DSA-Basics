import java.util.*;
import java.util.LinkedList;
public class JavaQueue{

    public static void main(String args[]){
        PriorityQueue<Integer> type1 = new PriorityQueue<Integer>();
        LinkedList<Integer> type2 = new LinkedList<Integer>();
        ArrayDeque<Integer> type3 = new ArrayDeque<Integer>();

        // Enqueue
        type1.add(12);
        type2.add(12);
        type3.add(12);
        // Dequeue
        type1.remove();
        type2.remove();
        type3.remove();
        // isEmpty
        type1.isEmpty();
        type2.isEmpty();
        type3.isEmpty();
        // front
        type1.peek();
        type2.peekFirst();
        type3.peekFirst();
        // rear 
        // No such method in Priority Queue
        type2.peekLast();
        type3.peekLast();
    }
}