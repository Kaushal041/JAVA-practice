package Java_class_Assignment;

import java.util.Scanner;

public class swap_without_3rd_variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number ");
        int num2 = sc.nextInt();
        System.out.println("==============BY ADDITION AND SUBSTRACION===========");
        System.out.println("Before"+"\n"+"First number is " + num1 + "\n" + "Second number is " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After"+"\n"+"First number is " + num1 + "\n" + "Second number is " + num2);

        System.out.println("==============BY XOR OPERATOR==============");
        System.out.println("Before"+"\n"+"First number is " + num1 + "\n" + "Second number is " + num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("After"+"\n"+"First number is " + num1 + "\n" + "Second number is " + num2);
        
        System.out.println("==============BY MULTIPLICATION AND DIVISION==============");
        System.out.println("Before"+"\n"+"First number is " + num1 + "\n" + "Second number is " + num2);
        num1 = num1 * num2;
        num2 = num1 / num2;
        num1 = num1 / num2;
        System.out.println("After"+"\n"+"First number is " + num1 + "\n" + "Second number is " + num2);
        sc.close();
    }
}
