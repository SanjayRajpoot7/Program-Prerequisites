import java.util.Scanner;

public class RocketLaunchCountdownForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the countdown starting number
        System.out.print("Enter the countdown start number: ");
        int counter = scanner.nextInt();
        
        
        for (int i = counter; i >= 1; i--) {
            System.out.println("T-minus " + i + " seconds");
        }
        
        // Print launch message when the countdown is complete
        System.out.println("Launch!");
        
        // Close the scanner
        scanner.close();
    }
}
