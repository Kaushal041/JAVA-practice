package Inharitance;

public class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Circle draw");
    }

    public static void main(String[] args) {
        Shape sd = new Circle();
        sd.draw();
    }
}
