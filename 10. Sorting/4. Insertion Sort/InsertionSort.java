public class InsertionSort{

    public static void main(String[] args){
        int[] arr = {5,6,4,3,2,1};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    // In ascending order: O(N) - Best Case
    // In descending order: O(N*N) - Worst and Average Case
    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}