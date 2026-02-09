/*
WAP in java to implement a class Electricity with
following specifications
Data Members:
AccNo
Name
Unit
Bill,
Members Functions:
* A parameterized constructor that will initialize
all data members values as passed values
and Bill value is as 0.
* calculateBill ( ) will calculate Electricity Bill on
basis of following conditions and initialize it in
Bill variable.
Unit               Rate
<= 150             3 Rs/Unit
>150 <= 300        4 Rs/Unit
>300               5.5Rs/Unit
* appliedOffer() will deduct bill on basis of following
conditions
Bill            Discount
<=3000          Nil
>3000 <=5000    5%
>5000           10%
* ShowAll() will display all data members values along with Bill
*/
package Java_class_Assignment;

import java.util.Scanner;

public class Electricity {
    int AccNo;
    String Name;
    int Unit;
    double Bill;

    public Electricity() {
    }

    public Electricity(int AccNo, String Name, int Unit) {
        this.AccNo = AccNo;
        this.Name = Name;
        this.Unit = Unit;
        this.Bill = 0;
    }

    void CalculateBill(){
        if(this.Unit <= 150){
            this.Bill += 3*this.Unit; 
        }
        else if(this.Unit >150 && this.Unit <= 300){
            this.Bill += 4*this.Unit;
        }
        else{
            this.Bill += 5*Unit;
        }
    }
    void appliedOffer(){
        if(this.Bill <=3000){
            System.out.println("No Discount");
        }

        else if(this.Bill > 3000 && this.Bill <= 5000){
            System.out.println("5% Discount Applied");
            this.Bill += (this.Bill*5)/100;
        }
        else{
            this.Bill += (this.Bill*10)/100;
            System.out.println("10% Discount Applied");
        }

    }
    void ShowAll(){
        System.out.println("Account No : "+this.AccNo);
        System.out.println("Name : "+this.Name);
        System.out.println("Units : "+this.Unit);
        System.out.println("Total payable Bill : "+this.Bill);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number : ");
        int Acc = sc.nextInt();
        System.out.println("Enter Name : ");
        String name = sc.next();
        System.out.println("Enter total Units : ");
        int unit = sc.nextInt();
        
        Electricity el = new Electricity(Acc,name,unit);

        el.CalculateBill();
        el.appliedOffer();
        el.ShowAll();

        sc.close();
    }

    
}
