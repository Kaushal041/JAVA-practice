package Java_class_Assignment;

import java.util.Scanner;

public class digit_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get reverse of it");
        int num = sc.nextInt();
        int rev = 0;
        while(num!=0){
            int count = num%10;
            rev = count;
            System.out.print(rev);
            num /=10;
        }
    }
}
