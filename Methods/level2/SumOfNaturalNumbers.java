import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to find the sum of n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1; // Base case: sum of 1 is 1
        } else {
            return n + sumRecursive(n - 1); // Recursive call
        }
    }

    // Method to find the sum using the formula n * (n + 1) / 2
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2; // Using the formula
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the number n
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the input is a valid natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (positive integer).");
        } else {
            // Calculate the sum using recursion
            int sumRecursive = sumRecursive(n);

            // Calculate the sum using the formula
            int sumFormula = sumFormula(n);

            // Display the results
            System.out.println("Sum using recursion: " + sumRecursive);
            System.out.println("Sum using formula (n * (n + 1) / 2): " + sumFormula);

            // Compare the results
            if (sumRecursive == sumFormula) {
                System.out.println("Both results are correct and match!");
            } else {
                System.out.println("There is an error in the computation.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
