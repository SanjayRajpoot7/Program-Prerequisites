import java.util.Scanner;

public class LargestAndSecondLargestMaxDigit {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define variables to store the maximum number of digits and the index
        int maxDigits = 10;  // Initial array size
        int[] digits = new int[maxDigits];  // Array to store digits
        int index = 0;

        // Store the digits of the number in the array
        while (number != 0) {
            // Check if the array size is sufficient, if not, increase the size
            if (index == maxDigits) {
                // Increase maxDigits by 10
                maxDigits += 10;

                // Create a new array with increased size
                int[] temp = new int[maxDigits];

                // Copy elements from the old array to the new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Assign the temp array back to digits
                digits = temp;
            }

            // Store the last digit in the array
            digits[index] = number % 10;
            number = number / 10;  // Remove the last digit from the number
            index++;  // Increment the index
        }

        // Find the largest and second largest digits in the array
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;  // Update second largest
                largest = digits[i];  // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];  // Update second largest
            }
        }

        // Display the results
        System.out.println("Digits in the number:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        // Close the scanner
        scanner.close();
    }
}
