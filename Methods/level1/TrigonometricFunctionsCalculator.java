import java.util.Scanner;

public class TrigonometricFunctionsCalculator {

    // Method to calculate trigonometric functions (sine, cosine, tangent) of an angle
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent using Math class
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results as an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Create an object of the TrigonometricFunctionsCalculator class
        TrigonometricFunctionsCalculator calculator = new TrigonometricFunctionsCalculator();

        // Take user input for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        // Call the method to calculate trigonometric functions
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.println("Sine of " + angle + "°: " + results[0]);
        System.out.println("Cosine of " + angle + "°: " + results[1]);
        System.out.println("Tangent of " + angle + "°: " + results[2]);

        // Close the scanner
        scanner.close();
    }
}
