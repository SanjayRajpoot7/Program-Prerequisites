import java.util.Scanner;

public class CalendarDisplay {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                            "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    // Method to check if the given year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to get the number of days in the given month
    public static int getNumberOfDays(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Check for February in a leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    // Method to calculate the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        // Adjust the month and year for calculation
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;

        return d0;  // Returns the day of the week (0 for Sunday, 1 for Monday, etc.)
    }

    // Method to print the calendar for the given month and year
    public static void printCalendar(int month, int year) {
        // Get the month name
        String monthName = getMonthName(month);

        // Get the number of days in the month
        int numOfDays = getNumberOfDays(month, year);

        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);

        // Display the calendar heading
        System.out.println("          " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");  // 4 spaces for each day of the week before the first day
        }

        // Print the days of the month
        for (int day = 1; day <= numOfDays; day++) {
            System.out.printf("%3d ", day);

            // Move to the next line after Saturday
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        // Move to a new line if the last line isn't full
        if ((firstDay + numOfDays) % 7 != 0) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for month and year
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Call the method to print the calendar for the given month and year
        printCalendar(month, year);

        scanner.close();
    }
}
