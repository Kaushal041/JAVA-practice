import java.util.Scanner;

public class a1_to_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        if (input > 0) {
            String result = convertToLetters(input);
            System.out.println("Output: " + result);
        } else {
            System.out.println("Invalid input. Please enter a positive number.");
        }

        scanner.close();
    }

    public static String convertToLetters(int num) {
        StringBuilder result = new StringBuilder();

        while (num > 0) {
            num--; // Adjust for 0-based index
            char letter = (char) ('A' + (num % 26));
            result.insert(0, letter);
            num /= 26;
        }

        return result.toString();
    }
}
