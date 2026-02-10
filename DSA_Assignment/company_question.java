
import java.util.Scanner;

/*
Q1. Student Name Processing System
A college wants to process student names entered by the user.
Write a C program that:

Accepts a student name as input

Displays the length of the name

Converts the name to uppercase

Reverses the name

Checks whether the name is a palindrome

Displays the final processed string

Q2. Text Editing Utility
A simple text editor needs to perform multiple operations on a given string.
Write a C program that:

Accepts a main string and a substring

Searches for the substring in the main string

If found, deletes the substring

Inserts another string at the same position

Replaces all spaces with an underscore (_)

Displays the modified string

Q3. Password Validation and Analysis
A system requires basic password analysis.
Write a C program that:

Accepts a password string

Displays each character of the password individually

Counts the number of digits, alphabets, and special characters

Converts lowercase letters to uppercase and vice versa

Searches for a specific character entered by the user

Displays the final password string

Q4. String List Management System
An application stores multiple strings entered by the user.
Write a C program that:

Accepts multiple strings

Displays all strings

Sorts the strings in alphabetical order

Compares two selected strings

Concatenates two strings

Displays the updated list of strings

*/
public class company_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //----------------------------------Q1----------------------------------
        // System.out.println("Enter your name : ");
        // String str = sc.next();
        // System.out.println("Length of name : "+str.length());
        // System.out.println("Uppercase name : "+str.toUpperCase());
        // StringBuilder rev =  new StringBuilder(str).reverse();
        // System.out.println(rev);
        // if(str.equals(rev))
        // System.out.println("isPalindrome");
        // else
        // System.out.println("Not a Palindrome");
        // System.out.println(str);
        
        //---------------------------------------Q2-----------------------------------
        // System.out.println("Enter a String : ");
        // String s1 = sc.nextLine();
        // System.out.println("Enter a substring : ");
        // String sb = sc.nextLine();
        // if(s1.contains(sb)){
        //     s1 = s1.replace(sb, "replaced");
        // }
        // s1 = s1.replace(" ", "_");
        // System.out.println("Modified String : " +s1);


        //----------------------------------Q3-------------------------
        System.out.println("Enter a password");
        String pass = sc.nextLine();
        char pass_arry []= pass.toCharArray();
        int countalpha = 0;
        int countschar = 0;
        int countdigit = 0;
        String spacial = "";

        for(int i=0;i<pass.length();i++){
            System.out.println(pass_arry[i]);
            if(Character.isAlphabetic(pass_arry[i])){
                countalpha++;
            }
            else if(Character.isDigit(pass_arry[i])){
                countdigit++;
            }
            else{
                spacial += pass_arry[i];
                countschar++;
            }
            if(Character.isUpperCase(pass_arry[i])){
                pass_arry[i] = Character.toLowerCase(pass_arry[i]);
            }
            else{
                pass_arry[i] = Character.toUpperCase(pass_arry[i]);
            }
        }
        System.out.println("Total Alphabet : " +countalpha);
        System.out.println("Total Digits : " +countdigit);
        System.out.println("Total Spacial Charater : " +countschar);
        System.out.println("Spacial Charater : " +spacial);
        System.out.println("Final Password");
        for(int i = 0;i<pass_arry.length;i++){
            System.out.print(pass_arry[i]);
        }
        


        sc.close();
    }
}
