import java.util.Scanner;

public class NaturalNumberSumForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a number
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        // Check if the input is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Calculate sum using the formula: n * (n + 1) / 2
            int sumFormula = n * (n + 1) / 2;
            
            // Calculate sum using a for loop
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }
            
            // Print both results
            System.out.println("Sum using the formula: " + sumFormula);
            System.out.println("Sum using the for loop: " + sumLoop);
            
            // Compare both results
            if (sumFormula == sumLoop) {
                System.out.println("Both results are correct.");
            } else {
                System.out.println("There is an error in the calculations.");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
