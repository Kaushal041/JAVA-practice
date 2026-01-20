/*
    Algorithm for Insertion Sort:
        1.Consider the first element as already sorted.
        2.Take the next element from the unsorted part.
        3.Compare it with elements in the sorted part.
        4.Swift all larger elements one position to the right.
        5.Insert the selected element at the correct 
        6.Repeat until all elements are sorted
        7.Stop
    
    Pseudo Code:
        InsertionSort(A,n)
        Begin
            For i <- 1 to n - 1 do
                key <- A[i]
                j <- i - 1
                while j >= 0 and A[j] > key do
                    A[j + 1] <- A[j]
                    j <- j + 1
                End While
                A[j + 1] <- key
            End For
        End
    
*/

public class insertion_sort {
    public static void main(String[] args) {
        int arr[] = {43,2,423,54,54,56,67,7,1,321,90,987,5,54,432,231};
        for(int i = 1;i<=arr.length - 1;i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
        arr[j + 1] = key;
    }for(int i = 0;i<arr.length;i++)
        System.out.print(arr[i] + " ");
    }
    
}
