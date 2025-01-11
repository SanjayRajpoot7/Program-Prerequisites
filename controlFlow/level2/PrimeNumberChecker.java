import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        // Create a Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Declare a boolean variable to check if the number is prime
        boolean isPrime = true;

        // If the number is less than 2, it is not a prime number
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to the number-1 to check divisibility
            for (int i = 2; i < number; i++) {
                // If the number is divisible by any number other than 1 and itself
                if (number % i == 0) {
                    isPrime = false;
                    break; // Exit the loop since we found a divisor
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }
}
