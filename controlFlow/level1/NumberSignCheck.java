import java.util.Scanner;

public class NumberSignCheck {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
        
        // Close the scanner
        scanner.close();
    }
}
