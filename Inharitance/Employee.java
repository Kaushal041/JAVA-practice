/*
Create a parent class Employee with a method calculateSalary().
Override this method in PermanentEmployee and ContractEmployee classes to
calculate salary differently.
*/
package Inharitance;

public class Employee {
    double salary;
    public void calculateSalary(double salary){
        System.out.println("Base Salary : "+salary);
    }

    public static void main(String[] args) {
        Employee e0 = new Employee();
        Employee e1 = new PermanentEmployee();
        Employee e2 = new ContractEmployee();
        e0.calculateSalary(10000);
        e1.calculateSalary(10000);
        e2.calculateSalary(10000);
    }

}
