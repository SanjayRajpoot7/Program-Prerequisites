import java.util.Scanner;

public class GreatestFactor {
    
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Take input from the user for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Variable to store the greatest factor
        int greatestFactor = 1;
        
        // Loop from the number - 1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            // Check if i is a factor of the number
            if (number % i == 0) {
                greatestFactor = i;  // Store the greatest factor
                break;  // Break the loop as we've found the greatest factor
            }
        }
        
        // Output the greatest factor (excluding the number itself)
        System.out.println("The greatest factor of " + number + " excluding itself is: " + greatestFactor);
        
        // Close the scanner
        scanner.close();
    }
}
