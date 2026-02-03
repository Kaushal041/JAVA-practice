
import java.util.Scanner;

public class Strong_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find Strong or not : ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while(num!=0){
            int last = num%10;
            num /=10;
            int fact = 1;
            for (int i = last;i>0;i--){
            fact *= i;
        }
        sum += fact;
        }
        if(sum == temp){
            System.out.println("Number is Strong Number");
        }
        else{
            System.out.println("Number is not Strong number");
        }
    }
}
