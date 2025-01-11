import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the number is a natural number (positive integer)
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Loop through numbers from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    // If the number is divisible by 2, it's even
                    System.out.println(i + " is an even number.");
                } else {
                    // Otherwise, the number is odd
                    System.out.println(i + " is an odd number.");
                }
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
