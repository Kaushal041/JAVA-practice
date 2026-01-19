
import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        
    //----------------- Linear Search  pre-define array----------------//
        // int [] arraysearch  = {10,20,30,40,50,60,70,10,80,10,90,100};
        // int target = 10;
        // int count = 0;
        // for(int i=0;i<arraysearch.length;i++){
        // if (arraysearch[i] == target){
        //     System.out.println("Element found at index: " + i);
        //     count ++;
        // }}
        // if(count == 0){
        //     System.out.println("Element not found in the array");
        // }
        // else{
        //     System.out.println("Total occurrences of element " + target + ": " + count);
             
        // }        
    
    
    //-------------------Linear Search with user define array--------------------------//
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many element you want in array -> ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter " + num +" element in array");
        for(int i = 0; i<num;i++){
            int insert = sc.nextInt();
            arr[i] = insert;
        }
        System.out.println("Enter element that you want to find ");
        int target = sc.nextInt();
        System.out.print("Your Array -> ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int count = 0;
        for(int i=0;i<arr.length;i++){
        if (arr[i] == target){
            System.out.println("Element found at index: " + i);
            count ++;
        }}
        if(count == 0){
            System.out.println("Element not found in the array");
        }
        else{
            System.out.println("Total occurrences of element " + target + ": " + count);
             
        }
        sc.close();
    }
}
