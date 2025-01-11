import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take user input for weight (in kg)
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();

        // Take user input for height (in cm)
        System.out.print("Enter height in cm: ");
        double heightInCm = scanner.nextDouble();

        // Convert height from cm to meters
        double heightInMeters = heightInCm / 100;

        
        double bmi = weight / (heightInMeters * heightInMeters);

       
        System.out.println("Your BMI is: " + bmi);

       
        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }

        // Close the scanner
        scanner.close();
    }
}
