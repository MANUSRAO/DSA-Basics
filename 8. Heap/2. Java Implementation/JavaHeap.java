import java.util.*;
public class JavaHeap {
    public static void main(String[] args){
        PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>((a,b)->(b-a));
        // Same thing: Collections.reverseOrder()
        
        // Inserting
        minheap.add(10);
        minheap.add(20);
        minheap.add(5);

        maxheap.add(5);
        maxheap.add(50);
        maxheap.add(15);

        // Peeking
        System.out.println(minheap.peek());
        System.out.println(maxheap.peek());

        // Popping
        minheap.poll();
        maxheap.poll();

        // Empty Condition
        minheap.isEmpty();
        maxheap.isEmpty();
    }
}