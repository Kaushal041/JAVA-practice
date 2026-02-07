/*
 **Write a Java program to illustrate constructor overloading in a `BankAccount` class with account number, name, and balance.**

*/

package methods;

public class bankAccount_cont {
    public bankAccount_cont(){
        System.out.println("----------Default Constructor----------");
    }

    public bankAccount_cont(int acc_no){
                System.out.println("------------1st Constructor------------");

        System.out.println("Account number : "+acc_no);
    }
    public bankAccount_cont(int acc_no, String name){
        System.out.println("------------2nd Constructor-----------------");
        System.out.println("Account number : "+acc_no);
        System.out.println("Name : "+name);
    }
    public bankAccount_cont(int acc_no, String name,double balance){
        System.out.println("-------------3rd Constructor-------------");
        System.out.println("Account Number : "+acc_no);
        System.out.println("Name : "+name);
        System.out.println("Balance : "+balance);
    }

    public static void main(String[] args) {
        bankAccount_cont b0 = new bankAccount_cont();
        bankAccount_cont b1 = new bankAccount_cont(1213498976);
        bankAccount_cont b2 = new bankAccount_cont(1213498976,"Kaushal");
        bankAccount_cont b3 = new bankAccount_cont(1213498976,"Kaushal",10000.00);
        
    }
    

}
