import java.util.Scanner;

public class StoreAndSumValues {

    public static void main(String[] args) {
        // Initialize the scanner for input
        Scanner scanner = new Scanner(System.in);

        // Initialize an array to store up to 10 values
        double[] numbers = new double[10];
        // Variable to store the total sum
        double total = 0.0;
        // Variable to keep track of the index of the array
        int index = 0;

        // Infinite while loop to get user input
        while (true) {
            // Take user input
            System.out.print("Enter a number (0 or a negative number to stop): ");
            double num = scanner.nextDouble();

            // Check if the entered number is 0 or negative, break the loop
            if (num <= 0 || index >= 10) {
                break;
            }

            // Store the number in the array
            numbers[index] = num;
            // Increment the index for the next element
            index++;
        }

        // Display all entered numbers
        System.out.println("\nEntered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println("Position " + (i + 1) + " = " + numbers[i]);
            total += numbers[i];  // Add to total sum
        }

        // Display the total sum of all numbers
        System.out.println("\nThe total sum of all numbers is: " + total);

        // Close the scanner
        scanner.close();
    }
}
