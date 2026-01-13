package Java_class_Assignment;

import java.util.Scanner;

public class hcf_lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number ");
        int num1 = sc.nextInt();
        System.out.println("Enter second Number ");
        int num2 = sc.nextInt();
        System.out.println("Factors of " +num1);
        for(int i = 1;i<=num1 ;){
            if(num1%2==0){
                System.out.println(i);
            }
            
        }
        System.out.println("Factors of " +num2);
        for(int i = 1;i<=num2 ; i++){
            if(num2%i==0){
                System.out.println(i);
            }
        }
    }
}
