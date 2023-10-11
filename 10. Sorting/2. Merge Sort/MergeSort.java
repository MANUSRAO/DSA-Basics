public class MergeSort {
    // TC : O(NlogN)
    // SC : O(N)
    // Based on Divide and Conquer
    public void mSort(int[] arr, int low, int high){
        if(low>=high)
            return;
        int mid = (low+high)/2;
        mSort(arr,low,mid);
        mSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public void merge(int[] arr, int low, int mid, int high){
        int n1 = mid-low+1;
        int n2 = high-mid;
        int []arr1 = new int[n1];
        int []arr2 = new int[n2];
        for(int i=0;i<n1;i++)
            arr1[i] = arr[low+i];
        for(int j=0;j<n2;j++)
            arr2[j] = arr[mid+1+j];
        int i = 0, j = 0;
        int k = low;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                arr[k] = arr1[i];
                k++;
                i++;
            }
            else{
                arr[k] = arr2[j];
                k++;
                j++;
            }
        }
        while(i<n1){
            arr[k] = arr1[i];
            k++;
            i++;
        }
        while(j<n2){
            arr[k] = arr2[j];
            k++;
            j++;
        }
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
 
        MergeSort ob = new MergeSort();
        ob.mSort(arr, 0, arr.length - 1);
 
        System.out.println("\nSorted array is");
        printArray(arr);
    }
}