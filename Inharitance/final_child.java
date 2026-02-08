package Inharitance;

public class final_child extends final_parent {
    @Override
    final void show(){    //As question says
        System.out.println("Child class");
    }
    public static void main(String[] args) {
        final_child fc = new final_child();
        fc.show();
    }
}
