/*
Write a program where a final variable stores the maximum number of login attempts.
Try modifying it and observe the compilation error.
*/
package Inharitance;

public class Login_Attempts {
    public static void main(String[] args) {
        final int login_attpt = 5;
           
            while (login_attpt !=0 ) {
                System.out.println("login attempt left : " + (login_attpt-1));
                login_attpt--;   //this is why because questions says to do
            }
    }
}
