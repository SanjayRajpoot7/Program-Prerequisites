import java.util.Scanner;

public class PowerOfNumber {
    
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the base number
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();
        
        // Take input for the power
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();
        
        // Variable to store the result
        int result = 1;
        
        // Loop to calculate the power using the result variable
        for (int i = 1; i <= power; i++) {
            result *= number;  // Multiply the result with the number in each iteration
        }
        
        // Output the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
        
        // Close the scanner
        scanner.close();
    }
}
