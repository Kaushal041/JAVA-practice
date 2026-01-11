//0 1 1 2 3 5 8 13 .......

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number for fabonacci series");
    int n = sc.nextInt();
    int a = 0;
    int b = 1;
    System.out.println(a);
    for(int i=1;i<n;i++){
        int c = a + b;
        b = a;
        a = c;
        System.out.println(c);
    }
    }
}
