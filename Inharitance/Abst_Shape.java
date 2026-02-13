/*
Create an abstract class Shape with an abstract method area().
Implement the method in Circle and Rectangle classes.
*/
package Inharitance;

abstract class Abst_Shape {
    abstract void area();

    public static void main(String[] args) {
        
    }

}


class Abst_Circle extends Abst_Shape{
    double Area;
    double radius = 4;
    @Override
    void area(){
        Area = 3.14*radius*radius;
    }

    void show(){
        System.out.println("Area of Circle : "+Area);
    }

    public static void main(String[] args) {
        Abst_Circle ac = new Abst_Circle();
        ac.area();
        ac.show();
    }
}


class Abst_Rectangle extends Abst_Shape{
    double length = 10, breadth = 20 ,Area;
    @Override
    void area(){
        Area = length*breadth;
    }

    void show(){
        System.out.println("Area of Rectangle : "+Area);
    }

    public static void main(String[] args) {
        Abst_Rectangle ra = new Abst_Rectangle();
        ra.area();
        ra.show();
    }
}
