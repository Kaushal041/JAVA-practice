/*
 **Write a Java program to illustrate method overloading by changing the number of arguments in a `Display` class.**

*/

package methods;

public class display_over {
    
    public void Display(int a){
        System.out.println("a = "+a);
    }
    public void Display(int a,int b){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public void Display(int a,int b,int c){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
    public static void main(String[] args) {
        display_over d = new display_over();
        d.Display(5);
        d.Display(6,3);
        d.Display(3,43,76);
    }
    
}
