/*
Create a base class Vehicle with a variable speed.
Create a child class Car that has its own speed.
Display both parent and child speed using the super keyword.
*/
package Inharitance;

public class vahical {
        int speed = 100;
}


class car extends vahical{
    
    int speed = 150;

    void show(){
        System.out.println("With super keyword child : " + speed);
        System.out.println("With super keyword parent : " + super.speed);
    }
    public static void main(String[] args) {
        car cs = new car();
        cs.show();
    }

}
