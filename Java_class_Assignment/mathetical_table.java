package Java_class_Assignment;

import java.util.Scanner;

public class mathetical_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numer to print table");
        int num = sc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(num + " X " + i + " = " + i*num);
        }
        sc.close();
    }
}
