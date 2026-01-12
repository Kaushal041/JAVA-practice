package Java_class_Assignment;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numer to check if it Armstrong or not");
        int num = sc.nextInt();
        int temp = num;
        int temp2 = num;
        int count = 0;
        int sum = 0;
        while (num != 0) {
            num = num/10;
            count++;
        }
        for(int i = 0; i<count;i++){
            int check = temp%10;
            sum += Math.pow(check,count);
            temp /= 10;
        }
        if(temp2 == sum){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
        sc.close();
    }
}
