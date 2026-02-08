package Inharitance;

public class Rectangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Rectangle draw");
    }
    public static void main(String[] args) {
        Shape sd = new Rectangle();
        sd.draw();
    }
}
