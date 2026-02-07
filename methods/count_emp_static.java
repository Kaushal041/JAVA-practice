/*
 **Write a Java program to illustrate the use of a static variable to count the number of employees in an organization.**
*/

package methods;

public class count_emp_static {

    static int count = 0;

    public count_emp_static() {
        count++;
    }


    
    public static void main(String[] args) {
        new count_emp_static();
        new count_emp_static();
        new count_emp_static();
        System.out.println("Total number of employees : "+count);
    }
    
}
