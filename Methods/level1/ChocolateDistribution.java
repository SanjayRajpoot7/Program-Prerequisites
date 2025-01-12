import java.util.Scanner;

public class ChocolateDistribution {

    // Method to find the number of chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // quotient will be the chocolates each child gets
        // remainder will be the remaining chocolates
        int quotient = number / divisor;
        int remainder = number % divisor;

        // Return both quotient and remainder in an array
        return new int[] { quotient, remainder };
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Call the method to find quotient and remainder
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Display the result
        System.out.println("Each child will get: " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
