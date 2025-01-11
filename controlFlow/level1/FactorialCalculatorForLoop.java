import java.util.Scanner;

public class FactorialCalculatorForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the number is a valid positive integer
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Initialize factorial to 1 (since factorial of 0 is 1)
            long factorial = 1;

            // Use a for loop to compute the factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i;  // Multiply factorial by i
            }

            // Print the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        // Close the scanner
        scanner.close();
    }
}
