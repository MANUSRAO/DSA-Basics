public class Stacks{
    // Here count is the no of spots filled in array
    static class StackImp {
        int[] arr;
        int count;
        StackImp(int capacity) {
            arr = new int[capacity];
            count=0;
        }
        public void push(int num) {
            if(isFull()==0){
                arr[count]=num;
                count++;
            }
        }
        public int pop() {
            if(isEmpty()==0){
                count--;
                return arr[count];
            }
            return -1;
        }
        public int top() {
            if(isEmpty()==0)
                return arr[count-1];
            return -1;
        }
        public int isEmpty() {
            if(count==0)
                return 1;
            return 0;
        }
        public int isFull() {
            if(count==arr.length)
                return 1;
            return 0;
        }
    }
}