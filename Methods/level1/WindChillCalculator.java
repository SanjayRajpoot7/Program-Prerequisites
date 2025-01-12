import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate the wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        // Applying the wind chill formula
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill; // Returning the calculated wind chill
    }

    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Create an object of the WindChillCalculator class
        WindChillCalculator calculator = new WindChillCalculator();

        // Take user input for temperature and wind speed
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed (in miles per hour): ");
        double windSpeed = scanner.nextDouble();

        // Check if wind speed is greater than or equal to 3 mph (valid range for wind chill calculation)
        if (windSpeed < 3) {
            System.out.println("Wind speed should be at least 3 mph for valid wind chill calculation.");
        } else {
            // Call the method to calculate wind chill
            double windChill = calculator.calculateWindChill(temperature, windSpeed);

            // Display the calculated wind chill temperature
            System.out.println("The wind chill temperature is: " + windChill + "°F");
        }

        // Close the scanner
        scanner.close();
    }
}
