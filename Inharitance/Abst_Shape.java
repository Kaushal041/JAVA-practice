/*
Create an abstract class Shape with an abstract method area().
Implement the method in Circle and Rectangle classes.
*/
package Inharitance;

abstract class Abst_Shape {
    abstract void area();

    public static void main(String[] args) {
        Abst_Shape asc = new Abst_Circle();
        Abst_Shape asr = new Abst_Rectangle();
        asc.area();
        asr.area();
    }

}


class Abst_Circle extends Abst_Shape{
    double Area;
    double radius = 4;
    @Override
    void area(){
        Area = 3.14*radius*radius;
        System.out.println("Area of Circle : "+Area);
    }
}


class Abst_Rectangle extends Abst_Shape{
    double length = 10, breadth = 20 ,Area;
    @Override
    void area(){
        Area = length*breadth;
        System.out.println("Area of Rectangle : "+Area);
    }

}
