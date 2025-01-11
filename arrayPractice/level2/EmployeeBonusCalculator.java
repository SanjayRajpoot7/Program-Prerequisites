import java.util.Scanner;

public class EmployeeBonusCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Declare arrays to store salary, years of service, bonus, and new salary for each employee
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        // Variables to calculate the total bonus, old salary, and new salary
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Loop to take input from the user for 10 employees
        for (int i = 0; i < 10; i++) {
            boolean validInput = false;
            while (!validInput) {
                // Input the salary of the employee
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                double salary = scanner.nextDouble();

                // Input the years of service of the employee
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                double years = scanner.nextDouble();

                // Validate the input: salary should be positive, years should be >= 0
                if (salary > 0 && years >= 0) {
                    salaries[i] = salary;
                    yearsOfService[i] = years;
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter positive salary and valid years of service.");
                    // Decrement the index counter to re-enter the current employee's details
                    i--;
                }
            }
        }

        // Loop to calculate the bonus, new salary, and totals for all employees
        for (int i = 0; i < 10; i++) {
            double bonus = 0.0;
            if (yearsOfService[i] > 5) {
                bonus = salaries[i] * 0.05;  // 5% bonus for employees with more than 5 years of service
            } else {
                bonus = salaries[i] * 0.02;  // 2% bonus for employees with 5 or less years of service
            }

            bonuses[i] = bonus;
            newSalaries[i] = salaries[i] + bonus;

            // Update total bonus, total old salary, and total new salary
            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display the total bonus payout, total old salary, and total new salary
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        // Close the scanner
        scanner.close();
    }
}
