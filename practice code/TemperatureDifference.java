
import java.util.Scanner;


public class TemperatureDifference {

    public static int maxTemperatureDifference(int[] temperatures) {
        // If the array is empty or has only one element, return 0 as no valid difference can be made
        if (temperatures == null || temperatures.length < 2) {
            return 0;
        }

        // Initialize variables
        int minTemperature = temperatures[0]; // Start with the first temperature
        int maxDifference = 0; // This will store the maximum difference

        // Traverse the array starting from the second element
        for (int i = 1; i < temperatures.length; i++) {
            // Calculate the difference between the current temperature and the minimum temperature so far
            int diff = temperatures[i] - minTemperature;

            // Update the maximum difference if the current difference is larger
            if (diff > maxDifference) {
                maxDifference = diff;
            }

            // Update the minimum temperature encountered so far
            if (temperatures[i] < minTemperature) {
                minTemperature = temperatures[i];
            }
        }

        return maxDifference; // Return the maximum difference found
    }

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of days (temperatures)
        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();
        
        // If number of days is less than 2, no valid temperature difference can be calculated
        if (n < 2) {
            System.out.println("At least two days are required.");
            return;
        }

        // Declare an array to store temperatures
        int[] temperatures = new int[n];

        // Get the temperatures from the user
        System.out.println("Enter the temperatures for each day:");
        for (int i = 0; i < n; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextInt();
        }

        // Call the function and print the result
        int result = maxTemperatureDifference(temperatures);
        System.out.println("The maximum temperature difference is: " + result);
        
        // Close the scanner
        scanner.close();
    }
}
