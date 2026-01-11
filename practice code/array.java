import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int [][] arr = new int [3][3];
        // arr[0][0]=101;
        // arr[0][1]=102;
        // arr[0][2]=103;
        // arr[1][0]=201;
        // arr[1][1]=202;
        // arr[1][2]=203;
        // arr[2][0]=301;
        // arr[2][1]=302;
        // arr[2][2]=303;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]);
        //         System.out.print(" ");
        //     }
        //     System.out.println("");
        // }




        // ------------sum of 1-D array-----------
        // float [] arr = {2.3f,2.1f,32.2f,4.9f,9.0f};
        // float sum=0;
        // for(int i=0;i<5;i++){
        //     sum +=arr[i];
        // }
        // System.out.println(sum);




        // --------------number is present or not in 1-D array----------
        // int [] arr ={1,2,3,4,5,546,77,68,67,768,87,45,67,5};
        // System.out.println("Enter a number");
        // int check = sc.nextInt();
        // int flag = 0;
        // for(int i=0;i<arr.length;i++){
        //     if (arr[i]==check) {
        //         flag+=1;
        //         break;
        //     }
        // }
        // if (flag==1) {
        //     System.out.println("Number is present");
        // }
        // else{
        //     System.out.println("Number is not present");
        // }



        //---------Average marks of test-----------
        // float [] marks = {76,78.5f,75,34.5f,90,80,93.5f,76,54.5f,65};
        // float sum=0;
        // for(int i=0;i<marks.length;i++){
        //     sum+=marks[i];
        // }
        // float ave=sum/10;
        // System.out.println(ave);



        //---------sum of two Matrixes------------------
        // int [][] matrix1 = {{1,2,3},{4,5,6}};
        // int [][] matrix2 = {{9,8,7},{6,5,4}};
        // // int [][] matrix1 = new int[2][3];
        // // int [][] matrix2 = new int[2][3];
        // // matrix1[0][0]=1;
        // // matrix1[0][1]=2;
        // // matrix1[0][2]=3;
        // // matrix1[1][0]=4;
        // // matrix1[1][1]=5;
        // // matrix1[1][2]=6;
        // // matrix2[0][0]=9;
        // // matrix2[0][1]=8;
        // // matrix2[0][2]=7;
        // // matrix2[1][0]=6;
        // // matrix2[1][1]=5;
        // // matrix2[1][2]=4;
        // for(int i=0;i<matrix1.length;i++){
        //     for(int j=0;j<matrix1[i].length;j++){
        //         matrix1[i][j] += matrix2[i][j];
        //         System.out.print(matrix1[i][j]);
        //         System.out.print(" ");
        //     }
        // System.out.println("");
        // }
        


        //------------revese print of array and maximum  and minimum element------------
        // int [] arr = {1,2,3,4,5,6,7,8,9,0};
        // int max = 0;
        // int min = 0;
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[9-i]);
        //     System.out.print(" ");
        //     if (max<arr[i]) {
        //             max = arr[i];
        //     }
        //     if (min>arr[i]) {
        //             min = arr[i];       
        //     }
        // }
        // System.out.printf("\nMaximum number of array is %d",max);
        // System.out.printf("\nMinimum number of array is %d",min);
                

        //------------array shorting checking--------------
        System.out.println("Enter an array of 5 elements");
        int [] inarr = new int[5]; 
        for(int i=0;i<5;i++){
            inarr[i] = sc.nextInt();
        }
        System.out.println("Shorted array ");
        // Arrays.sort(inarr);

        for(int i=0;i<=4;i++){
            if (i==4) {
                i=0;
            }

            if (inarr[i]>inarr[i+1]) {
                int  temp = 0;
                temp=inarr[i];
                inarr[i]=inarr[i+1];
                inarr[i+1]=temp;
            }
            System.out.print(inarr[i] + " ");
        }
    }
}