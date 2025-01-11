import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Initialize the total to 0.0
        double total = 0.0;
        double number;
        
        // Infinite while loop until user enters 0 or a negative number
        while (true) {
            // Ask the user to input a number
            System.out.print("Enter a number (or 0 or negative to stop): ");
            number = scanner.nextDouble();
            
           
            if (number <= 0) {
                break;
            }
            
            // Add the number to the total if it's positive
            total += number;
        }
        
        // Print the total sum
        System.out.println("The total sum is: " + total);
        
        // Close the scanner
        scanner.close();
    }
}
