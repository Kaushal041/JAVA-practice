//Write a programmed input to number and calculate its HCF and LCM without using Any predefined Mathematical function

package Java_class_Assignment;

import java.util.Scanner;

public class hcf_lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number ");
        int num1 = sc.nextInt();
        System.out.println("Enter second Number ");
        int num2 = sc.nextInt();
        int hcf = 0;
        // for(int i = 1;i<=num1 && i<=num2;i++){
        //     if(num1%i==0 && num2%i==0){
        //         hcf = i;
        //     }
            
        // }

        hcf = num1;
        int b = num2;
        while(b!=0){
            int temp = b;
            b = hcf%b;
            hcf=temp;
        }

        int lcm = (num1 *num2)/hcf;
        System.out.println("HCF = " + hcf);
        System.out.println("LCM = "+lcm);
        
    }
}
