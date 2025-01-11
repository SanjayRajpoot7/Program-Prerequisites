import java.util.Scanner;

public class FindFactors {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();
        
        // Check if the number is valid (greater than 0)
        if (number <= 0) {
            System.out.println("Please enter a valid positive number.");
            return; // Exit the program if the number is not valid
        }
        
        // Initialize the maximum size of the factors array and the current index
        int maxFactor = 10; // initial size of the array
        int[] factors = new int[maxFactor];
        int index = 0;

        // Loop to find the factors
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) { // If i is a factor of number
                
                // Check if the array needs resizing
                if (index == maxFactor) {

                    // Double the size of the factors array
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];

                    // Copy old factors to the new larger array
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp; // Assign the resized array to factors
                }
                // Store the factor in the array
                factors[index] = i;
                index++; // Increment the index for the next factor
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println(); // New line after factors

        // Close the scanner object
        scanner.close();
    }
}
