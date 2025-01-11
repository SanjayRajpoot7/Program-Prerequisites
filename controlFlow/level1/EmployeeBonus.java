import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take the salary and years of service as input from the user
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();
        
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = scanner.nextInt();
        
        // Check if the employee is eligible for a bonus
        if (yearsOfService > 5) {
            // Calculate 5% bonus
            double bonus = salary * 0.05;
            System.out.println("The employee is eligible for a bonus of: INR " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
