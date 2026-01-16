package Java_class_Assignment;

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
            this.bill =this.bill - (this.bill*10)/100;
        }
    }
    void ShowAll(){
        System.out.println("Customer name is "+this.name);
        System.out.println("Customer's Account Number is : "+this.acc_number);
        System.out.println("Total units are : " + this.unit);
        System.out.println("Total payable bill is : "+this.bill);
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
