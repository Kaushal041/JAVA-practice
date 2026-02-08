/*
Create an abstract class Bank with an abstract method getInterestRate().
Implement it in SBI and HDFC classes and display interest rates
*/
package Inharitance;

abstract  class Abst_Bank {
    abstract void getInterestRate();

    public static void main(String[] args) {
        Abst_Bank sbi = new Abst_Sbi();
        Abst_Hdfc hdfc = new Abst_Hdfc();
        sbi.getInterestRate();
        hdfc.getInterestRate();
    }
}
