/*
 **Write a Java program to illustrate accessing members of a static inner class from the main method.**
*/

package methods;

public class static_to_main_access {
    
    static class inner{
        static int num = 10;
    }

    public static void main(String[] args) {
        System.out.println(static_to_main_access.inner.num);
    }

}
