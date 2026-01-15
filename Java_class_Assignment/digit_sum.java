package Java_class_Assignment;

import java.util.Scanner;

public class digit_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = 0;
        while(num !=0){
            int count = num%10;
            num /=10;
            sum += count;
        }
        System.out.println("Total sum of digits is : " + sum);
    }
}
