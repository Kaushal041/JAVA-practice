package DSA_Assignment;

public class Binary_serach {
    public static void main(String[] args) {
        
        //----------------- Binary Search ----------------//
        int [] arr = {10,20,30,40,50,60,70,80,90,100};
        int target = 1000;
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end)/2;
        int count = 1;
        int i=0;
        while (i<arr.length){
            if (target==arr[mid]){
                System.out.println("Element found : " + (mid + 1));
                count = 0;
                break;
            }
            else if(target < arr[mid]){
                end = mid - 1;
                mid = (start + end)/2;
            }
            else if(target > arr[mid]){
                start = mid + 1;
                mid = (start + end)/2;
            }
            i++;
        }
        if(count == 1){
            System.out.println("Element not found in the array");
        }

        //----------------- Formatted Output ----------------//
        // Scanner sc=new Scanner(System.in);
        //     System.out.println("================================");
        //     for(int i=0;i<3;i++)
        //     {
        //         // System.out.println("Enter String : ");
        //         String s1=sc.next();
        //         // System.out.println("Enter Integer : ");
        //         int x=sc.nextInt();
        //         if(s1.length()!=15){
        //            int CharSize = 15 - s1.length();
        //            String padString = String.format("%-15s",s1);
        //         //    System.out.println("String " + s1 + " padded with " + CharSize + " spaces");
        //         }
        //         else if(String.valueOf(x).length()!=3){
        //             int intSize = 3 - String.valueOf(x).length();
        //             // System.out.println("Integer " + x + " padded with " + intSize + " zeros");
        //         }
        //         System.out.printf("%-15s%03d%n", s1, x);                         
        //     }
        //     System.out.println("================================");

    
        
    }
}
