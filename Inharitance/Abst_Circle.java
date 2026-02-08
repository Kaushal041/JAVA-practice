package Inharitance;

public class Abst_Circle extends Abst_Shape{
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
