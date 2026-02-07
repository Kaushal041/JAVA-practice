/*
 **Write a Java program to illustrate a static method for checking eligibility of a student without creating an object.**

*/

package methods;

public class without_obj {
    
    static int percentage = 70;

    static void eligible(){
        if(percentage > 60){
            System.out.println("Student is pass");
        }
        else{
            System.out.println("Student is fail");
        }
    }

    public static void main(String[] args) {
        eligible();
    }
}
