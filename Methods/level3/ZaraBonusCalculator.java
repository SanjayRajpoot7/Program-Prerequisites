import java.util.Random;

public class ZaraBonusCalculator {

    // Method to generate random salary and years of service for each employee
    public static double[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        double[][] employeeData = new double[numEmployees][2]; // 2 columns: Salary and Years of Service

        for (int i = 0; i < numEmployees; i++) {
            // Random salary between 10000 and 99999
            employeeData[i][0] = 10000 + random.nextInt(90000);  // Salary
            // Random years of service between 1 and 20
            employeeData[i][1] = 1 + random.nextInt(20);  // Years of service
        }

        return employeeData;
    }

    // Method to calculate the new salary and bonus based on years of service
    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3]; // 3 columns: Old Salary, New Salary, Bonus

        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonus = 0;

            // Calculate bonus based on years of service
            if (yearsOfService > 5) {
                bonus = 0.05 * oldSalary;  // 5% bonus for employees with more than 5 years
            } else {
                bonus = 0.02 * oldSalary;  // 2% bonus for employees with less than or equal to 5 years
            }

            double newSalary = oldSalary + bonus;

            // Store the old salary, new salary, and bonus in the updated data array
            updatedData[i][0] = oldSalary;
            updatedData[i][1] = newSalary;
            updatedData[i][2] = bonus;
        }

        return updatedData;
    }

    // Method to calculate the sum of old salary, new salary, and total bonus
    public static double[] calculateTotals(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < updatedData.length; i++) {
            totalOldSalary += updatedData[i][0];
            totalNewSalary += updatedData[i][1];
            totalBonus += updatedData[i][2];
        }

        return new double[]{totalOldSalary, totalNewSalary, totalBonus};
    }

    // Method to display the employee data in a tabular format
    public static void displayEmployeeData(double[][] updatedData, double[] totals) {
        System.out.printf("%-15s%-15s%-15s%-15s\n", "Employee", "Old Salary", "New Salary", "Bonus");

        for (int i = 0; i < updatedData.length; i++) {
            System.out.printf("%-15d%-15.2f%-15.2f%-15.2f\n", (i + 1), updatedData[i][0], updatedData[i][1], updatedData[i][2]);
        }

        // Displaying totals
        System.out.printf("\n%-15s%-15.2f%-15.2f%-15.2f\n", "Total", totals[0], totals[1], totals[2]);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        // Step 1: Generate employee data (salary and years of service)
        double[][] employeeData = generateEmployeeData(numEmployees);

        // Step 2: Calculate new salary and bonus
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData);

        // Step 3: Calculate totals (sum of old salary, new salary, and total bonus)
        double[] totals = calculateTotals(updatedData);

        // Step 4: Display the results in a tabular format
        displayEmployeeData(updatedData, totals);
    }
}
