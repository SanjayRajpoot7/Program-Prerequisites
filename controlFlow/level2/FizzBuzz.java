import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Loop from 1 to the input number
            for (int i = 1; i <= number; i++) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if the number is divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if the number is divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Otherwise, print the number
                else {
                    System.out.println(i);
                }
            }
        }

        // Close the scanner
        scanner.close();
    }
}
