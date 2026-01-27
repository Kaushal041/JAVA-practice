

import java.util.Scanner;

public class buleSort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num[] = new int[3];
        for(int i=0;i<num.length;i++){
            num[i] = sc.nextInt();
        }
        for(int j=0;j<num.length-1;j++){
            for(int i = 0;i<num.length-1-j;i++){
                if(num[i]>num[i+1]){
                    int temp = num[i];
                    num[i] = num[i+1];
                    num[i+1] = temp;
                }
            }
        }
            System.out.println("Sorting is done :)");
            for(int i=0;i<3;i++){
                System.out.print(num[i] + " ");
            }
            sc.close();
    }
}