/*
Create an abstract class Payment with an abstract method payAmount().
Implement it in UPI and CreditCard classes.
*/
package Inharitance;

abstract  class Abst_Payment {
    abstract void payAmount();

    public static void main(String[] args) {
        Abst_Payment upi = new Abst_upi();
        Abst_Payment cc = new Abst_CreditCard();
        upi.payAmount();
        cc.payAmount();
    }
}

class Abst_CreditCard extends Abst_Payment{
    @Override
    void payAmount(){
        System.out.println("Payable Amount is 20500");
    }
}


class Abst_upi extends Abst_Payment{
    @Override
    void payAmount(){
        System.out.println("Cradit limit is 70000");
    }
}
