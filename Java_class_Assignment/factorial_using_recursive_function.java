package Java_class_Assignment;

import java.util.Scanner;

public class factorial_using_recursive_function {
    
    static int factorial(int fact){
        if (fact==0){
            return 1;
        }
        return fact*factorial(fact - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a numeber : ");
        int fact = sc.nextInt();
        System.out.println(factorial(fact));
        sc.close();
    }
}
