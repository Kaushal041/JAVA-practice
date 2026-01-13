package Java_class_Assignment;


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
    double bill = 0;
    String fabric_type , cloth_type ;
    int quantity ;
    
    public store(String fabric_type,String cloth_type,int quantity){
      this.fabric_type = fabric_type;
      this.cloth_type = cloth_type;
      this.quantity = quantity;
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
    }
    void Display(){
      if(bill>4000){
        bill = (bill*10)/100;
        System.out.println("Your Total bill with 10% Discount is : "+bill);}
        else{
          System.out.println("Your Total bill is : "+bill);
        }
      }
      public static void main(String[] args) {
        store st = new store("cotton","saree",2);
        st.calculate_bill();
        st.Display();
    }
}