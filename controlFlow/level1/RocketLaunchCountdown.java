import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the countdown starting number
        System.out.print("Enter the countdown start number: ");
        int counter = scanner.nextInt();
        
        // Using a while loop to count down from the input value to 1
        while (counter >= 1) {
            System.out.println("T-minus " + counter + " seconds");
            counter--;  // Decrement the counter
        }
        
        // Print launch message when the countdown is complete
        System.out.println("Launch!");
        
        // Close the scanner
        scanner.close();
    }
}
