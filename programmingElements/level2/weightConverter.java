import java.util.Scanner;

public class weightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();
        
        // Conversion factor from pounds to kilograms
        double conversionFactor = 2.2;
        
        // Convert pounds to kilograms
        double weightInKg = weightInPounds / conversionFactor;
        
        // Display the result
        System.out.println("The weight of the person in pounds is: " + weightInPounds + " lbs");
        System.out.println("The weight of the person in kilograms is: " + weightInKg + " kg");
        
        // Close the scanner to avoid resource leakage
        scanner.close();
    }
}
