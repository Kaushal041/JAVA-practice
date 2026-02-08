package Inharitance;

import methods.overloading;

public class PermanentEmployee extends Employee{
    @Override
    public void calculateSalary(double salary){
        salary +=10000;
        System.out.println("Permanent Employee Salary : "+salary);
    }
}
