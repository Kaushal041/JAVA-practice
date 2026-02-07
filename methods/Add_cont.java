/*
 **Write a Java program to illustrate method overloading by performing addition of integers, floats, and doubles.**

*/

package methods;

public class Add_cont {
    
    public int Add(int num1, int num2){
        return num1+num2;
    }
    
    public float Add(float num1,float num2){
        return num1+num2;
    }

    public double  Add(double  num1, double num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        Add_cont add = new Add_cont();
        System.out.println("Integer add : "+add.Add(17,3));
        System.out.println("Float add : "+add.Add(17f,3f));
        System.out.println("Double add : "+add.Add(17.0,3.0));
    }
}
