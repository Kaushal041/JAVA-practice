package Inharitance;

public class Abst_Manager extends Abst_Employee{
    @Override
    void salary(){
        System.out.println("Salary is ₹70000");
    }
    @Override
    void designation(){
        System.out.println("Designation is Manager");
    }
}
