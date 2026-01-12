package Java_class_Assignment;

import java.util.Scanner;

public class prime_btw_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number : ");
        int start = sc.nextInt();
        System.out.println("Enter ending number : ");
        int end = sc.nextInt();
        for(int j = start;j<=end;j++){
            if(j <= 1){
                continue;
            }
            boolean isPrime = true;
                for(int i = 2; i * i <= j; i++ ){
                    if(j%i==0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.println(j);
                }
            }
        sc.close();
    }
}
