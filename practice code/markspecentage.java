import java.util.Scanner;
public class markspecentage{

    public static void main(String[] args){
        System.out.println("Enter out of numbers ");
        Scanner sc = new Scanner(System.in);
        Byte to1 = sc.nextByte();

        System.out.println("Enter sub1 numbers ");
        Byte sub1 = sc.nextByte();

        System.out.println("Enter sub2 numbers ");
        Byte sub2 = sc.nextByte();

        System.out.println("Enter sub3 numbers ");
        Byte sub3 = sc.nextByte();

        System.out.println("Enter sub4 numbers ");
        Byte sub4 = sc.nextByte();

        System.out.println("Enter sub5 numbers ");
        Byte sub5 = sc.nextByte();

        System.out.println("Percentage of your numbers ");
        int per = ((sub1+sub2+sub3+sub4+sub5)*to1);
        float per1 = per/500;
        System.out.println(per1);
    }
}
