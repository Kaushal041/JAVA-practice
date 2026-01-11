import java.util.Scanner;

public class multiple_base_till_limit {
    public void Multiply(int base, int limit) {
        int multiple = base;
        while (multiple <= limit) {
            System.out.println(multiple);
            multiple += base;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = scanner.nextInt();
        System.out.print("Enter limit: ");
        int limit = scanner.nextInt();
        
        multiple_base_till_limit obj = new multiple_base_till_limit();
        obj.Multiply(base, limit);
        
        scanner.close();
    }
}