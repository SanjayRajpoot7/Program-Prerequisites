import java.util.Scanner;

public class MultiplesOfNumber {
    
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Print the multiples of the number below 100
        System.out.println("Multiples of " + number + " below 100 are:");
        
        // Loop backward from 100 to 1
        for (int i = 100; i >= 1; i--) {
            // Check if i is a multiple of the number
            if (i % number == 0) {
                System.out.println(i); // Print the multiple
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
