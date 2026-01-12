package Java_class_Assignment;

import java.util.Scanner; 

public class palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome or not");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(num != 0){
            int rev1 = num%10;
            num = num/10;
            rev = rev1 + rev*10;
        } 
        if(temp == rev)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");
        sc.close();
    }
}