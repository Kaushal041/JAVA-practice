package Java_class_Assignment;

import java.util.Scanner;

public class leap_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check if it is Leap year or not");
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is a Leap year");
        } else {
            System.out.println(year + " is not a Leap year");
        }
    }
}
