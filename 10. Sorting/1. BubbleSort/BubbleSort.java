public class BubbleSort{

    public static void main(String[] args){
        int[] arr = {5,6,4,3,2,1};
        bubblesort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    // In ascending order, TC: O(N)
    // In descending order, TC: O(N*N)
    // SC: O(1)
    // During every itertion, the largest element is placed at its correct position
    static void bubblesort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}