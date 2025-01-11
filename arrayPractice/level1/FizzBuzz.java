import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask for a positive integer input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the input is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return; // Exit the program if input is invalid
        }

        // Create a String array to store the FizzBuzz results
        String[] resultArray = new String[number];

        // Loop from 1 to the number and apply FizzBuzz logic
        for (int i = 0; i < number; i++) {
            int currentNumber = i + 1; // Current number (starting from 1)
            
            // Check the FizzBuzz conditions
            if (currentNumber % 3 == 0 && currentNumber % 5 == 0) {
                resultArray[i] = "FizzBuzz";
            } else if (currentNumber % 3 == 0) {
                resultArray[i] = "Fizz";
            } else if (currentNumber % 5 == 0) {
                resultArray[i] = "Buzz";
            } else {
                resultArray[i] = String.valueOf(currentNumber); // If not a multiple of 3 or 5, store the number itself
            }
        }

        // Print the results from the array in the required format
        for (int i = 0; i < resultArray.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + resultArray[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
