package Inharitance;

public class car extends vahical{
    
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
