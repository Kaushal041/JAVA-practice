/*
 **Write a Java program to illustrate the order of execution of multiple static blocks.**
*/
package methods;

public class order_static_execution {
    
    static {
        System.out.println("Static 01");
    }
    static {
        System.out.println("Static 02");
    }
    static {
        System.out.println("Static 03");
    }

    public static void main(String[] args) {
        
    }

}
