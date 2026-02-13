/*
 Create an abstract class Appliance with an abstract method start().
Implement it in WashingMachine and Refrigerator classes
*/
package Inharitance;

abstract  class Abst_Appliance {
    abstract void start();

    public static void main(String[] args) {
        Abst_Appliance wm = new Abst_WashMachine();
        Abst_Appliance rf = new Abst_Refrigerator();
        wm.start();
        rf.start();
    }
}

class Abst_Refrigerator extends Abst_Appliance {
    @Override
    void start(){
        System.out.println("Refrigerator is ON");
    }
}


class Abst_WashMachine extends Abst_Appliance {
    @Override
    void start(){
        System.out.println("Washing Machine is now started");
    }
}
