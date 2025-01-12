import java.util.Scanner;

public class ChocolateDivision {

    // Method to find quotient (chocolates each child gets) and remainder (remaining chocolates)
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2]; // Array to store quotient and remainder

        result[0] = number / divisor; // Quotient: chocolates each child gets
        result[1] = number % divisor; // Remainder: remaining chocolates

        return result; // Return array containing quotient and remainder
    }

    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Check if there are children to divide the chocolates
        if (numberOfChildren == 0) {
            System.out.println("Error: Division by zero is not possible (no children).");
        } else {
            // Call the method to find quotient (chocolates per child) and remainder (remaining chocolates)
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Display the results
            System.out.println("Each child will get: " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        // Close the scanner
        scanner.close();
    }
}
