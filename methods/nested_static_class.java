/*
 **Write a Java program to illustrate a static nested class for validating user credentials.**
*/

package methods;

public class nested_static_class {

    static class validade{
        static void user_validate(String uname,String pass){
            if(uname.equals("Kaushal") && pass.equals("1234")){
                System.out.println("Welcome");
            }
            else{
                System.out.println("Invalid credentials");
            }
        }
    }

    public static void main(String[] args) {
        nested_static_class.validade.user_validate("Kaushal", "1234");
    }
}
