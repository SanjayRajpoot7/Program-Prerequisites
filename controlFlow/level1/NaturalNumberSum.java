import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        //number is a natural number or not
        if (number > 0) {
            // Calculate the sum of the first n natural numbers
            int sum = (number * (number + 1)) / 2;
            
          
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
           
            System.out.println("The number " + number + " is not a natural number");
        }
        
        // Close the scanner
        scanner.close();
    }
}
