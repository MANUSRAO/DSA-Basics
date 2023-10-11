/*
    We can either make push to be costly or pop to be costly.
    For each push operation O(N); O(1) for all other operations.

    Space complexity: O(max(N1, N2))

    where Q is the number of queries, N denotes the maximum number of elements in the queue and
    'N1' and 'N2' denote the size of queues 'q1' and 'q2'.
*/
import java.util.LinkedList;
import java.util.Queue;
public class StackUsingQueue{
    static class Stack {
        public Queue<Integer> q1;
        public Queue<Integer> q2;

        public Stack() {
            this.q1 = new LinkedList<>();
            this.q2 = new LinkedList<>();
        }

        public int getSize() {
            // Return the size of the queue 'q1'.
            return this.q1.size();
        }

        public boolean isEmpty() {
            return this.getSize() == 0;
        }

        public void push(int data) {
            // Enqueue new element to q2.
            this.q2.add(data);

            // Enqueue all the elements of q1 into q2.
            while (this.q1.size() > 0) {
                this.q2.add(this.q1.peek());
                this.q1.poll();
            }

            // Swap q1 and q2.
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

        }

        public int pop() {
            // If empty, return -1.
            if (isEmpty()) {
                return -1;
            }
            // Simply dequeue from the queue q1.
            int ans = this.q1.peek();
            this.q1.poll();

            return ans;
        }

        int top() {
            if (isEmpty()) {
                return -1;
            }
            int ans = this.q1.peek();

            return ans;
        }
    }
}