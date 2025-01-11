import java.util.Scanner;

public class FindFactors {
    
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Print the factors of the number
        System.out.println("The factors of " + number + " are: ");
        
        // Loop through numbers from 1 to the number-1
        for (int i = 1; i <= number; i++) {
            // Check if i is a factor of number
            if (number % i == 0) {
                System.out.println(i); // Print the factor
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
