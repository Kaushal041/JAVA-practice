/*
 **Write a Java program to illustrate accessing static variables and static methods using the class name.**
*/
package methods;

public class static_call_by_class_name {
    
    static int num = 10;

    static void function(){
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        System.out.println("static variable : "+static_call_by_class_name.num);
        static_call_by_class_name.function();
    }


}
