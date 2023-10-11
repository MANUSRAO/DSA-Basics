import java.util.*;
public class QueueUsingStack{
    
    public static void main(String[] args){
        myQueue queues = new myQueue();
        queues.enqueue(10);
        queues.enqueue(11);
        System.out.println(queues.dequeue());
        System.out.println(queues.isEmpty());
        System.out.println(queues.front());
    }
}

class myQueue{
    Stack<Integer> s1, s2;

    myQueue(){
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    void enqueue(int ele){
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        s1.push(ele);
        while(!s2.empty()){
            s1.push(s2.pop());
        }
    }

    int dequeue(){
        if(!s1.empty())
            return s1.pop();
        return -1;
    }

    boolean isEmpty(){
        return s1.size()==0?true:false;
    }

    int front(){
        if(!s1.empty())
            return s1.peek();
        return -1;
    }
}