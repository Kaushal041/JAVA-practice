package Java_class_Assignment;

import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even or odd");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
        sc.close();
    }
}
