import java.util.ArrayDeque;
import java.util.Deque;
public class myDeque{
    // Deque is an interface, whereas ArrayDeque is the class implementing deque.
    public static void main(String[] args){
        Deque<Integer> deque = new ArrayDeque<>();
        // Adding the element
        deque.addFirst(1);
        deque.addLast(2);
        // Getting the element
        deque.getFirst();
        deque.getLast();
        // Removing the element
        int first = deque.removeFirst();
        int last = deque.removeLast();
        System.out.println("First: " + first + ", Last: " + last);
    }
}