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


class Abst_Sbi extends Abst_Bank {
    @Override
    void getInterestRate(){
        System.out.println("Interest rate is 5");
    }
    // public static void main(String[] args) {
    //     Abst_Sbi sg = new Abst_Sbi();
    //     sg.getInterestRate();
    // }
}


class Abst_Hdfc extends Abst_Bank{
    @Override
    void getInterestRate(){
        System.out.println("Interest rate is 10");
    }

    // public static void main(String[] args) {
    //     Abst_Hdfc hg = new Abst_Hdfc();
    //     hg.getInterestRate();
    // }
}


