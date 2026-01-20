

/*Step:
    1.Find the minimum element in the array.
    2.Swap it with the first element.
    3.Repeat for the remaining unsorted portion.

  Time Complexity:
    Best: O(n²)
    Average: O(n²)
    Worst: O(n²)

  Algorithm for Selection Sort:
    1.Start with the first element of the list.
    2.Find the smallest element at the first position by swapping.
    3.Place of the smallest elemnet at the first position by swapping.
    4.Move to the next position and repeat the process for the remaining elements.
    5.Continue until the entire list is sorted.
    6.Stop

  Pseudo code:
    SelectionSort(A,n)
    Begin
        For i <- 0 to n - 2 do
            min <- i
            For j <- i + 1 to n - 1 do
                If A[j] < A[Min] then
                    min <- j
                End If
            End For
            Swap A[i] and A[min]
        End For
    End 

*/

public class selection_sort {
    public static void main(String[] args) {
        int arr[] = {10,3,2,445,56,67,87,98,54,34,34,65,0,78,23,0};
        for(int i = 0; i< arr.length - 1;i++){
            int min = i;
            for(int j = i + 1; j<arr.length;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
