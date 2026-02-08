package Inharitance;

public class ContractEmployee extends Employee{
    @Override
    public void calculateSalary(double salary){
        salary = salary*8;
        System.out.println("Contract Employee : " + salary);
    }
}
