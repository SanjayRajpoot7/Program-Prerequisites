import java.util.Scanner;

public class SmallestLargest {

    // Method to find smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] result = new int[2]; // Array to store the smallest and largest numbers
        
        // Initialize smallest and largest with the first number
        result[0] = number1; // smallest
        result[1] = number1; // largest

        // Compare with the second number
        if (number2 < result[0]) {
            result[0] = number2; // Update smallest
        }
        if (number2 > result[1]) {
            result[1] = number2; // Update largest
        }

        // Compare with the third number
        if (number3 < result[0]) {
            result[0] = number3; // Update smallest
        }
        if (number3 > result[1]) {
            result[1] = number3; // Update largest
        }

        return result; // Return array containing smallest and largest
    }

    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for 3 numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Call the method to find smallest and largest
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the results
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
        
        // Close the scanner
        scanner.close();
    }
}
