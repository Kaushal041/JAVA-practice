/*
Create a class Account with account number and balance.
Derive SavingsAccount from it and add interest calculation.
Demonstrate inheritance using object creation.
*/
package Inharitance;

public class Account {
    int acc_number;
    double balance = 1000;

}


class SavingAccount extends Account {
    public void intrest_cal(int rate, int time){
        super.balance += (super.balance*rate*time)/100;
    }
    
    void show(){
        System.out.println("Total balance : "+super.balance);
    }
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.intrest_cal(2, 2);
        sa.show();

    }
}
