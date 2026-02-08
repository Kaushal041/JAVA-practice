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
