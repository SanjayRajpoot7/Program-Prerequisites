import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for month, day, and year
        System.out.print("Enter month (1 for January, 2 for February, ..., 12 for December): ");
        int m = scanner.nextInt(); // Month (1 for January, 2 for February, ..., 12 for December)

        System.out.print("Enter day: ");
        int d = scanner.nextInt(); // Day

        System.out.print("Enter year: ");
        int y = scanner.nextInt(); // Year

        // Step 1: Adjust year for January and February
        int y0 = y - (14 - m) / 12;

        // Step 2: Calculate x using the given formula
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Step 3: Adjust month value
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Step 4: Calculate the day of the week
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Output the result
        System.out.println("Day of the week: " + d0);

        // Print the day of the week (0 for Sunday, 1 for Monday, etc.)
        switch (d0) {
            case 0:
                System.out.println("The day is Sunday.");
                break;
            case 1:
                System.out.println("The day is Monday.");
                break;
            case 2:
                System.out.println("The day is Tuesday.");
                break;
            case 3:
                System.out.println("The day is Wednesday.");
                break;
            case 4:
                System.out.println("The day is Thursday.");
                break;
            case 5:
                System.out.println("The day is Friday.");
                break;
            case 6:
                System.out.println("The day is Saturday.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}
