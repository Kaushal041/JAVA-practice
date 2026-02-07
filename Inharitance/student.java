package Inharitance;

import java.util.Scanner;

/*
1. Write a Java program where Student inherits from Person.
Read name and age in the parent class and roll number and 
course in the child class.
Display all details using a child class object
*/

public class student extends person {

    int rollno;
    String course;

    public student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your roll no. : ");
        rollno = sc.nextInt();
        System.out.println("Enter your course : ");
        course = sc.next();

    }

    void display(){
        System.out.println("---------Student Details------");
        System.out.println("Name : " + name);
        System.out.println("Age : "+ age);
        System.out.println("Roll No. : "  +rollno);
        System.out.println("Course : " + course);
    }

    public static void main(String[] args) {
        
        student ob = new student();
        ob.display();

    }
}
