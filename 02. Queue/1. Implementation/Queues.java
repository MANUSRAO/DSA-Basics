public class SimpleQueue{
    public static void main(String[] args){
        myQueue queue = new myQueue(1000);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue.dequeue()
                           + " dequeued from queue\n");
        System.out.println("Front item is "
                           + queue.front());
        System.out.println("Rear item is "
                           + queue.rear());
    }
}

class myQueue{
    int size;
    int[] arr;
    int front;
    int rear;
    myQueue(int n){
        this.size = n;
        arr = new int[n];
        front = 0;
        rear=0;
    }

    void enqueue(int ele){
        if(!isFull()){
            arr[rear] = ele;
            rear++;
        }
    }

    int dequeue(){
        if(!isEmpty()){
            int ele = arr[front];
            front++;
            if(front==rear){
                front=0;
                rear=0;
            }
            return ele;
        }
        return -1;
    }

    boolean isFull(){
        if(rear==size)
            return true;
        return false;
    }

    boolean isEmpty(){
        if(front==rear)
            return true;
        return false;
    }

    int front(){
        if(isEmpty())
            return -1;
        return arr[front];
    }

    int rear(){
        if(isEmpty())
            return -1;
        return arr[rear-1];
    }
}