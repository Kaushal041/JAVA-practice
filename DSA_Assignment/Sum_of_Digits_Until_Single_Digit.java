
import java.util.Scanner;

public class Sum_of_Digits_Until_Single_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find Sum of Digits Until Single Digit ");
        int num = sc.nextInt();
        int sum = 0;
        while(num>0 || sum>9){
            if(num == 0){
                num = sum;
                sum = 0;
            }
            int last = num%10;
            sum += last;
            num /=10;
        }
        System.out.println(sum);
    }
}
