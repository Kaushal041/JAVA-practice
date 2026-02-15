/*
Write programme in Java to implement a class electricity with following specification:
Data member:
account number
name
unit
bill member function:
*A parameterized constructor that will initialise all data member value as passed values and bill is as 0
* CalCalculateBill() will electricity bill on basis of following condition and initialise it in Bill variable:
Unit                   Rate
<=150                  3 Rs/unit
>150 <=300             4 Rs/unit
        >300                   5.5 Rs/unit
        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*AppliedOffer() will deduct bill on basis of following conditions:
Bill             Discount
<= 3000          Nil
>3000 <= 5000    5%
>5000            10%
* showAll () will display all data members values along with Bill.

*/

package methods;

public class electricity_bill {
    String acc_number;
    String name;
    int unit;
    double bill;
    public electricity_bill(String acc_number, String name, int unit) {
        this.acc_number = acc_number;
        this.name = name;
        this.unit = unit;
        this.bill = 0;
    }
    void calculate_bill(){
        if(this.unit <= 150){
            this.bill = 3*this.unit;
        }
        else if(this.unit > 150 && this.unit<= 300){
            this.bill = 4*this.unit;
        }
        else{
            this.bill = 5.5*this.unit;
        }
    }
    void appliedOffer(){
        if(this.bill <=3000)
            this.bill = this.bill;
        else if(this.bill > 3000 && this.bill<=5000){
            System.out.println("5% discount applied");
            this.bill -= (this.bill*5)/100;
        }
        else{
            System.out.println("10% discount applied");
            this.bill -= (this.bill*10)/100;
        }
    }
    void ShowAll(){
        System.out.println("Customer name : "+this.name);
        System.out.println("Account Number : "+this.acc_number);
        System.out.println("Total units : " + this.unit);
        System.out.println("Total payable bill : "+this.bill);
    }


    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int
        
        // sc.close();

        electricity_bill ob = new electricity_bill("12345678","kaushal",1000);
        ob.calculate_bill();
        ob.appliedOffer();
        ob.ShowAll();

    }
}
