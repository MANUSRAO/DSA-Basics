import java.util.*;
public class myPQ{
    // Priority Queue arranges elements based on priority
    public static void main(String[] args){
        // Ascending order
        PriorityQueue<Integer> ascPQ = new PriorityQueue<Integer>();
        // Descending order
        PriorityQueue<Integer> desPQ = new PriorityQueue<Integer>((a,b)->b-a);
        
        // PriorityQueue<Integer> desPQ = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        // Adding elements
        ascPQ.add(30);
        ascPQ.add(20);
        ascPQ.add(10);

        desPQ.add(10);
        desPQ.add(20);
        desPQ.add(30);

        // Peek
        System.out.println(ascPQ.peek());
        System.out.println(desPQ.peek());
 
        // Removing top element
        System.out.println(ascPQ.poll());
        System.out.println(desPQ.poll());
    }
}