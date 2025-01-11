import java.util.Scanner;

public class FizzBuzzUsingLoop {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Initialize the counter variable
            int i = 1;
            
            // Use a while loop to iterate from 1 to the input number
            while (i <= number) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if the number is divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if the number is divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Otherwise, print the number
                else {
                    System.out.println(i);
                }

                // Increment the counter variable
                i++;
            }
        }

        // Close the scanner
        scanner.close();
    }
}
