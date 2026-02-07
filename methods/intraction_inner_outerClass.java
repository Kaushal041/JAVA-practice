/*
 **Write a Java program to illustrate interaction between an outer class and its static inner class.**
*/
package methods;

public class intraction_inner_outerClass {
    static int num1 = 10;

    static class inner{
        static int num2 = 20;
    }
    public static void main(String[] args) {
        int a = intraction_inner_outerClass.inner.num2 - intraction_inner_outerClass.num1;
        int b = intraction_inner_outerClass.inner.num2 + intraction_inner_outerClass.num1;
        System.out.println("A = "+a);
        System.out.println("B = "+b);
    }
}
