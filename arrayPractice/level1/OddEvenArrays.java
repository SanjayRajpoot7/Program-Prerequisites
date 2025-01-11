import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a positive natural number.");
            return;  // Exit the program if not a valid number
        }

        // Calculate the size of arrays for odd and even numbers
        int evenSize = number / 2 + 1; // Size for even array
        int oddSize = number / 2 + 1;  // Size for odd array

        // Create arrays to store odd and even numbers
        int[] evenNumbers = new int[evenSize];
        int[] oddNumbers = new int[oddSize];
        
        // Initialize index variables for odd and even arrays
        int evenIndex = 0, oddIndex = 0;
        
        // Loop through numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {  // Even number
                evenNumbers[evenIndex++] = i;
            } else {  // Odd number
                oddNumbers[oddIndex++] = i;
            }
        }

        // Print the odd numbers array
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Print the even numbers array
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
        
        // Close the scanner
        scanner.close();
    }
}
