/*
Create a final class with a final method that calculates square of a number.
Call the method from the main function.
*/
package Inharitance;

final class final_Cal_Square {
    int square ;
    final void CalSquareOfNumber(int num){
        square = num*num;
    }
    void display(){
        System.out.println("Square of Number : "+square);
    }

    public static void main(String[] args) {
        final_Cal_Square csof = new final_Cal_Square();
        csof.CalSquareOfNumber(5);
        csof.display();
    }

}
