import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask for an integer input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the sum of divisors
        int sum = 0;

        // Loop to find the divisors and sum them
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // Check if i is a divisor of number
                sum += i;  // Add i to sum
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
