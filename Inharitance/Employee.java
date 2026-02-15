/*
Create a parent class Employee with a method calculateSalary().
Override this method in PermanentEmployee and ContractEmployee classes to
calculate salary differently.
*/
package Inharitance;

public class Employee {
    double salary = 10000;
    public void calculateSalary(){
        System.out.println("Base Salary : "+salary);
    }

    public static void main(String[] args) {
        Employee e0 = new Employee();
        Employee e1 = new PermanentEmployee();
        Employee e2 = new ContractEmployee();
        e0.calculateSalary();
        e1.calculateSalary();
        e2.calculateSalary();
    }

}


class ContractEmployee extends Employee{
    @Override
    public void calculateSalary(){
        salary *=8;
        System.out.println("Contract Employee Salary : " + salary);
    }
}


 class PermanentEmployee extends Employee{
    @Override
    public void calculateSalary(){
        salary *=5;
        System.out.println("Permanent Employee Salary : "+salary);
    }
}
