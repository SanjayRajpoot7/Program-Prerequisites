import java.util.Scanner;

public class QuotientRemainder {

    // Method to find quotient and remainder of a division
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2]; // Array to store quotient and remainder

        // Calculate quotient and remainder
        result[0] = number / divisor; // Quotient
        result[1] = number % divisor; // Remainder

        return result; // Return array containing quotient and remainder
    }

    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for two integers
        System.out.print("Enter the first number (dividend): ");
        int number = scanner.nextInt();

        System.out.print("Enter the second number (divisor): ");
        int divisor = scanner.nextInt();

        // Check if divisor is zero to prevent division by zero
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            // Call the method to find quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // Display the results
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

        // Close the scanner
        scanner.close();
    }
}
