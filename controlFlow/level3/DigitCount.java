import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the input integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Variable to keep track of the number of digits
        int count = 0;

        // Handle the case when the number is 0
        if (number == 0) {
            count = 1;  // 0 has exactly one digit
        } else {
            // Loop to count the digits by removing the last digit in each iteration
            while (number != 0) {
                number = number / 10;  // Remove the last digit
                count++;  // Increase the digit count
            }
        }

        // Display the result
        System.out.println("The number has " + count + " digits.");

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
