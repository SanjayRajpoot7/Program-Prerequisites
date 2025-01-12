import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Check if the year is at least 1582 (Gregorian calendar starts from this year)
        if (year < 1582) {
            return false; // The Gregorian calendar does not apply before 1582
        }

        // A year is a leap year if:
        // 1. It is divisible by 4,
        // 2. It is not divisible by 100, unless divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true; // It's a leap year
        } else {
            return false; // It's not a leap year
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Call the method to check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        // Close the scanner
        scanner.close();
    }
}
