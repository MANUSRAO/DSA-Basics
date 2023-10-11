public class HeapSort{

    // TC: O(N*LogN)
    public static void main(String[] args){
        int[] arr = {5,6,4,3,2,1};
        heapSort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    // Min Heap gives descending order
    // Max Heap gives ascending order
    static void heapSort(int[] arr){
        buildheap(arr);
        int n = arr.length;
        for(int i=n-1;i>0;i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr,0,i);
        }
    }

    static void heapify(int[] arr, int i, int size){
        int smaller = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<size && arr[smaller]>arr[l])
            smaller=l;
        if(r<size && arr[smaller]>arr[r])
            smaller=r;
        if(smaller!=i){
            int temp = arr[i];
            arr[i] = arr[smaller];
            arr[smaller] = temp;
            heapify(arr,smaller,size);
        }
    }

    static void buildheap(int[] arr){
        int n = arr.length;
        for(int i=(n-1)/2;i>=0;i--){
            heapify(arr,i,n);
        }
    }
}