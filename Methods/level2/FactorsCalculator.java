import java.util.Scanner;

public class FactorsCalculator {

    // Method to find the factors of a number and store them in an array
    public static int[] findFactors(int number) {
        // Count the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++; // Increment count for each factor
            }
        }

        // Create an array to store the factors
        int[] factors = new int[count];
        int index = 0;

        // Store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors; // Return the factors array
    }

    // Method to find the sum of the factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static int findProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of the square of the factors
    public static double findSumOfSquares(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2); // Square of each factor
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the factors of the number
        int[] factors = findFactors(number);

        // Display the factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calculate and display the sum of the factors
        int sum = findSum(factors);
        System.out.println("Sum of factors: " + sum);

        // Calculate and display the product of the factors
        int product = findProduct(factors);
        System.out.println("Product of factors: " + product);

        // Calculate and display the sum of squares of the factors
        double sumOfSquares = findSumOfSquares(factors);
        System.out.println("Sum of square of factors: " + sumOfSquares);

        // Close the scanner
        scanner.close();
    }
}
