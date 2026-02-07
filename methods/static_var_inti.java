/*
 **Write a Java program to illustrate initialization of static variables using a static block.**
*/
package methods;

public class static_var_inti {
    static String name;
    static {
        name = "Kaushal Rawat";
        System.out.println("Static Name : "+name);
    }
    public static void main(String[] args) {
        
    }
}
