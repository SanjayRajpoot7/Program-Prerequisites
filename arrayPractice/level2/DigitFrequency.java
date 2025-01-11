import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Take the number as input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Initialize a frequency array of size 10 (for digits 0 to 9)
        int[] frequency = new int[10];
        
        // Convert the number to a positive value if it's negative
        number = Math.abs(number);
        
        // Find the frequency of each digit
        while (number > 0) {
            int digit = number % 10;   // Extract the last digit of the number
            frequency[digit]++;        // Increment the count of the extracted digit
            number = number / 10;      // Remove the last digit from the number
        }
        
        // Display the frequency of each digit
        System.out.println("Frequency of digits:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {  // Only print digits that appear in the number
                System.out.println(i + ": " + frequency[i]);
            }
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
