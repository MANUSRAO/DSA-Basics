public class Heaps{
    // If zero-indexing is used
    // Node: i
    // Parent: (i-1)/2
    // Left Child: 2*i+1
    // Right Child: 2*i+2

    // If one-indexing is used
    // Node: i
    // Parent: i/2
    // Left Child: 2*i
    // Right Child: 2*i+1

    public static void main(String[] args){
        myHeap heap = new myHeap(6);
        System.out.println("Starting");
        heap.insert(3);
        heap.printHeap();
        heap.insert(10);
        heap.printHeap();
        heap.insert(12);
        heap.printHeap();
        heap.insert(8);
        heap.printHeap();
        heap.insert(2);
        heap.printHeap();
        heap.insert(4);
        heap.printHeap();
        heap.delete();
        heap.printHeap();
    }
}

class myHeap{

    int[] arr;
    int maxsize;
    int size;

    myHeap(int n){
        arr = new int[n];
        maxsize = n;
        size = 0;
    }
    // we have used 0-indexing here
    // TC: O(logN)
    void insert(int ele){
        if(size>=maxsize)
            return;
        else{
            arr[size] = ele;
            int index = size;
            while(index>0){
                int parent = (index-1)/2;
                if(arr[parent]>arr[index]){
                    int temp = arr[parent];
                    arr[parent] = arr[index];
                    arr[index] = temp;
                }
                index = parent;
            }
            size++;
        }
    }

    // TC:O(logN)
    void delete(){
        if(!(size==0)){
            arr[0] = arr[size-1];
            arr[size-1] = 0;
            size = size-1;
            int i=0;
            while(i<size){
                int left_ind = 2*i+1;
                int right_ind = 2*i+2;
                if(!(left_ind<size && right_ind<size))
                    return;
                int left = arr[2*i+1];
                int right= arr[2*i+2];
                int smaller = left<right?2*i+1:2*i+2;
                if(smaller<size && arr[i]>arr[smaller]){
                    int ele = arr[i];
                    arr[i] = arr[smaller];
                    arr[smaller] = ele;
                    i = smaller;
                }
                else
                    return;
            }
        }
        return;
    }
    // TC: O(1)
    int getMin(){
        if(size==0)
            return -1;
        return arr[0];
    }

    void printHeap(){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("\n");
    }
}