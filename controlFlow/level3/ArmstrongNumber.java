import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take the number as input
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt();
        
        // Store the original number to compare later
        int originalNumber = number;
        
        
        int sum = 0;
        
        // While loop to process each digit of the number
        while (number != 0) {
            // Find the last digit using modulus operator
            int digit = number % 10;
            
            // Calculate the cube of the digit
            sum += digit * digit * digit;
            
            
            number /= 10;
        }

        // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        // Close the scanner
        scanner.close();
    }
}
