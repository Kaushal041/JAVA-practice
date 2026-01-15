package Java_class_Assignment;

import java.util.Scanner;

/* WAP to To implement class store that following specification:
Data member:
quality - int
bill - double
fabric_type  - string
cloth_type  - string
member function: 
  *a parameterized constructor in which you will pass fabric_type, cloth_type and quality and initialise bill as 0 
  *calculate_bill() that will calculate bill and assigned it in bill data member On basis of the following condition 
  if cloth type is saree:
  fabric_type        price
  Cotton             1300/-
  silk               1400/-
  if Cloth_type is "Jeans"
  fabric_type        price
  cotton             800/-
  silk               900/-
  An additional 10% discount given If total Bill exceeds 4000/- 
  *Showall() that Display all such member values 
  */
  class store {
    double bill;
    String fabric_type , cloth_type;
    int quantity ;
    
    public store(String fabric_type,String cloth_type,int quantity){
      this.fabric_type = fabric_type;
      this.cloth_type = cloth_type;
      this.quantity = quantity;
      this.bill = 0;
    }
    
    void calculate_bill(){
      if(cloth_type.equals("saree")){
        if(fabric_type.equals("cotton")){
          bill = 1300*quantity;
        }
        else{
          bill = 1400*quantity;
        }}
      else{
        if(fabric_type.equals("cotton")){
          bill = 800*quantity;
        }
        else{
          bill = 900*quantity;
      }}   
      if(bill>4000){
        bill = bill - (bill*10)/100;
      }
      }
    void Display(){
      System.out.println("Cloth : "+cloth_type);
      System.out.println("Fabric : "+fabric_type);
      System.out.println("Quantity : "+ quantity);
      System.out.println("Total bill : "+bill );
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cloth type saree or jean");
        String cloth = sc.next();

        System.out.println("Enter Fabric type cotton or silk");
        String fabric = sc.next();

        System.out.println("Enter quntity of cloth");
        int qty = sc.nextInt(); 

        store st = new store(fabric,cloth,qty);
        st.calculate_bill();
        st.Display();
    }
}