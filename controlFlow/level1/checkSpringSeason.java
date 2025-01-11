import java.util.Scanner;

public class checkSpringSeason {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the month and day
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();
        
        // Check if the month and day fall within the Spring season
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        
        // Close the scanner
        scanner.close();
    }
}
