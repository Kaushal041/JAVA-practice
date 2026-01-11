import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 1;
        while (start !=0) {
            System.out.print("Enter the First number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("Type 1 for Addition :-)\nType 2 for Substraction :-)\nType 3 for Multipilication :-)\nType 4 for Division :-)\nType 0 for Exit :-)");
        int operator = sc.nextInt();
        switch (operator) {
            case 1 ->System.out.printf("A + B = %d \n",a+b);
            case 2 -> System.out.println("A - B : \n"+(a-b));
            case 3 -> System.out.println("A * B : \n"+(a*b));
            case 4 -> System.out.println("A / B : \n"+(a/b));
            case 0 -> start = 0;
            default -> System.out.println("Invalid cridensial, Try again :-(");
        }
    }
    }
}
