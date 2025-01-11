import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Store the original number for later division check
        int originalNumber = number;

        // Variable to store the sum of the digits
        int sum = 0;

        // Loop to calculate the sum of the digits of the number
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            sum += digit;  // Add the digit to the sum
            number = number / 10;  // Remove the last digit
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad number.");
        }

        // Close the scanner
        scanner.close();
    }
}
