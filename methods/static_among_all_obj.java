/*
 **Write a Java program to illustrate how a static variable is shared among all objects of a class.**
*/

package methods;

public class static_among_all_obj {
    
    static String name = "Kaushal";

    public static_among_all_obj() {
        System.out.println(static_among_all_obj.name);
    }
    
    
    // public static_among_all_obj(String name) {
    //     System.out.println("-----------Object 1------- ");
    //     System.out.println("Name: "+static_among_all_obj.name);
    // } 

    // public static_among_all_obj(int roll,String name) {
    //     System.out.println("-----------Object 2------- ");
    //     System.out.println("Roll No.: "+roll);
    //     System.out.println("Name: "+static_among_all_obj.name);
    // } 
    
    // public static_among_all_obj(int roll,String name,String course) {
    //     System.out.println("-----------Object 3------- ");
    //     System.out.println("Roll No.: "+roll);
    //     System.out.println("Name: "+static_among_all_obj.name);
    //     System.out.println("Course: "+course);
    // } 
    
    public static void main(String[] args) {
        
        // static_among_all_obj ob1 = new static_among_all_obj(static_among_all_obj.name);
        // static_among_all_obj.name = "Kaushal Rawat";
        // static_among_all_obj ob2 = new static_among_all_obj(12,static_among_all_obj.name);
        // static_among_all_obj ob3 = new static_among_all_obj(12,static_among_all_obj.name,"MCA");
        
        static_among_all_obj ob1 = new static_among_all_obj();
        // new static_among_all_obj();
        static_among_all_obj.name = "Kaushal Rawat";
        static_among_all_obj ob2 = new static_among_all_obj();
        // new static_among_all_obj();
    }
}
