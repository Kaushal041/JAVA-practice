/*
Write a program to show the order of constructor execution when a child class object is created from a parent class.
*/
package Inharitance;

public class Porder_cont {

    public Porder_cont() {
        System.out.println("From Persent 1st");
    }
    
    
}


class Order_cunstor extends Porder_cont {

    public Order_cunstor() {
        System.out.println("From Child 2nd");
    }

    public static void main(String[] args) {
        Porder_cont po = new Order_cunstor();

    }
    
}
