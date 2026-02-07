package Inharitance;

import java.util.Scanner;

public class person {
    String name;
    int age;
    
    public person() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        name = sc.nextLine();
        System.out.println("Enter your age : ");
        age = sc.nextInt();
        sc.close();
    }
}
