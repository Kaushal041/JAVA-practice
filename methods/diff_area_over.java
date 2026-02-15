/*
 **Write a Java program to illustrate method overloading by calculating area of different shapes (circle, rectangle, square).**

*/
package methods;

public class diff_area_over {

    public diff_area_over() {
    System.out.println("---------Default Constructor-----------");
    }

    public void area(double  radius){
        System.out.println("Area of Circle : " + (3.14*(radius*radius)));
    }

    public void area(int length,int breadth){
        System.out.println("Area of Rectangle : "+(length*breadth));
    }

    public void area(int length){
        System.out.println("Area of Square : " + (length*length));
    }
    public static void main(String[] args) {
        diff_area_over d0 = new diff_area_over();
        d0.area(10.1);
        d0.area(10,20);
        d0.area(5);

    }
    
}
