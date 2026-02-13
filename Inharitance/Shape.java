/*
Create a parent class Shape with a method draw().
Override this method in Circle and Rectangle classes and call it using parent reference.
*/
package Inharitance;

public class Shape {
    public void draw(){
        System.out.println("Parent draw");
    }

    public static void main(String[] args) {
        Shape Ss = new Shape();
        Ss.draw();
        Shape Sc = new Circle();
        Sc.draw();
        Shape Sr = new Rectangle();
        Sr.draw();
    }
}


class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Circle draw");
    }

    // public static void main(String[] args) {
    //     Shape sd = new Circle();
    //     sd.draw();
    // }
}


class Rectangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Rectangle draw");
    }
    // public static void main(String[] args) {
    //     Shape sd = new Rectangle();
    //     sd.draw();
    // }
}
