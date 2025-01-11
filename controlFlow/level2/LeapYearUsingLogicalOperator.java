import java.util.Scanner;

public class LeapYearUsingLogicalOperator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is valid (should be >= 1582)
        if (year < 1582) {
            System.out.println("The year should be greater than or equal to 1582.");
        } else {
            // Check if the year is a leap year using a single if condition with logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
