import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Initialize the total to 0.0
        double total = 0.0;
        double number;
        
        // Start the loop to take user input
        do {
            // Ask the user to input a number
            System.out.print("Enter a number (or 0 to stop): ");
            number = scanner.nextDouble();
            
            // If the number is not 0, add it to the total
            if (number != 0) {
                total += number;
            }
        } while (number != 0);  // Continue until user enters 0
        
        // Print the total sum
        System.out.println("The total sum is: " + total);
        
        // Close the scanner
        scanner.close();
    }
}
