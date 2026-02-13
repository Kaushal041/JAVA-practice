/*
Create an abstract class Employee with abstract methods salary() and designation().
Implement these methods in a Manager class.
*/
package Inharitance;

abstract  class Abst_Employee {
    abstract void salary();
    abstract void designation();
    public static void main(String[] args) {
        Abst_Employee manager = new Abst_Manager();
        manager.designation();
        manager.salary();
    }
}


class Abst_Manager extends Abst_Employee{
    @Override
    void salary(){
        System.out.println("Salary is ₹70000");
    }
    @Override
    void designation(){
        System.out.println("Designation is Manager");
    }
}

