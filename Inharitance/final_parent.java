/*
Create a parent class with a final method show().
Create a child class and attempt to override the method
*/
package Inharitance;

public class final_parent {
    final void show(){
        System.out.println("Parent final method");
    }
}


class final_child extends final_parent {
    @Override
    final void show(){    //As question says
        System.out.println("Child class");
    }
    public static void main(String[] args) {
        final_child fc = new final_child();
        fc.show();
    }
}
