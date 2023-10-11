public class CircularQueue{
    int size;
    int[] arr;
    int front;
    int rear;
    CircularQueue(int n){
        size = n;
        arr = new int[n];
        front=-1;
        rear=-1;
    }

    boolean isEmpty(){
        if(front==-1)
            return true;
        return false;
    }
    
    boolean isFull(){
        if((front==0 && rear==size-1)||(front==(rear+1)%size))
            return true;
        return false;
    }
    
    void enqueue(int ele){
        if(!isFull()){
            rear = (rear+1)%size;
            arr[rear] = ele;
            if(front==-1)
                front=0;
        }
    }

    int dequeue(){
        if(!isEmpty()){
            int data = arr[front];
            if(front==rear){
                front=-1;
                rear=-1;
            }
            else
                front = (front+1)%size;
            return data;
        }
        return -1;
    }

    public static void main(String[] args){

    }
}