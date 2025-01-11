import java.util.Scanner;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
      
        boolean isPrime = true;

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            isPrime = false;
        } else {
           
            for (int i = 2; i <= Math.sqrt(number); i++) {
                // Check if number is divisible by i
                if (number % i == 0) {
                    isPrime = false;
                    break; // No need to continue checking further
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
