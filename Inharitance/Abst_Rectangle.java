package Inharitance;

public class Abst_Rectangle extends Abst_Shape{
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
