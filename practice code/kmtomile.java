import java.util.Scanner;

public class kmtomile {
    public static void main(String[] args) {
        System.out.println("Enter a number in kilometer");
        Scanner sc = new Scanner(System.in);
        float km = sc.nextFloat();
        float mile = km*0.621371f;
        System.out.println(mile);
    }
}
