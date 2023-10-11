public class QuickSort{

    // TC : O(NlogN)
    // TC in worst case : O(N*N)
    // SC : O(1)
    // Picking a pivot element and place it in its correct place

    public static void qSort(int[] arr, int low, int high){
        if(low<high){
            int p = partition(arr,low,high);
            qSort(arr,low,p);
            qSort(arr,p+1,high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low, j = high;
        while(i<j){
            while(i<high && arr[i]<=pivot){
                i++;
            }
            while(j>low && arr[j]>pivot){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    static void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given array is");
        printArray(arr);
 
        QuickSort ob = new QuickSort();
        ob.qSort(arr, 0, arr.length - 1);
 
        System.out.println("\nSorted array is");
        printArray(arr);
    }

}