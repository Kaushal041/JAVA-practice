
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
        String str = sc.next();
        System.out.println("Length of name : "+str.length());
        System.out.println("Uppercase name : "+str.toUpperCase());
        StringBuilder rev =  new StringBuilder(str).reverse();
        System.out.println(rev);
        if(str.equals(rev))
        System.out.println("isPalindrome");
        else
        System.out.println("Not a Palindrome");
        System.out.println(str);
        
        
    }
}
