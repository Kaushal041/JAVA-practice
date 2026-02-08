package Inharitance;

public class Order_cunstor extends Porder_cont {

    public Order_cunstor() {
        System.out.println("From Child 2nd");
    }

    public static void main(String[] args) {
        Porder_cont po = new Order_cunstor();

    }
    
}
