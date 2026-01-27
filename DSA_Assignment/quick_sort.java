/*
Steps:
    1. Choose a pivot element
    2. Partition elements is smaller than Pivot to the left and larger to the right
    3. Recursively employee the same process to subarrays

Time Complexity
    1.Best: O(n log n)
    2.Average: O(n log n)
    3.Worst: O(n²)



*/
public class quick_sort {
    static int partition(int arr[],int low,int high){
        int i = low - 1;
        int pivot = arr[high];
        for(int j = low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void quicksort(int arr[],int low,int high){
        if(low < high){
            int pi = partition(arr,low,high);

            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {32,45,6,3,2,76,0,8,7,0,76,34,23};
        quicksort(arr, 0, arr.length-1);
        System.out.print("Sorted array : ");
        for(int num : arr){
            System.out.print(num + " " );
        }
    }
}
