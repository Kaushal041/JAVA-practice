/*
**Write a Java program to illustrate constructor overloading using different ways of creating a `Student` object.**

*/

package methods;

public class student_cont {
    public student_cont(){
        System.out.println("Default constructor");
    }

    public student_cont(int rollno , String Name) {
        System.out.println("Rollno. : "+rollno);
        System.out.println("Name : "+Name);
    }
    
    public student_cont(String course, String branch){
        System.out.println("Course : "+course);
        System.out.println("Branch : "+branch);
    }

    public student_cont(double marks , double percentage) {
        System.out.println("Marks : "+marks);
        System.out.println("Percentage : "+percentage+"%");
    }

    public static void main(String[] args) {
        student_cont s1 = new student_cont();
        student_cont s2 = new student_cont(23,"Kaushal");
        student_cont s3 = new student_cont("Mca","MCA");
        student_cont s4 = new student_cont(90,90);

    }
    
}
