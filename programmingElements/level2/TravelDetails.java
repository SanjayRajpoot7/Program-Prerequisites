import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for name and cities
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter the from city: ");
        String fromCity = scanner.nextLine();
        
        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();
        
        System.out.print("Enter the to city: ");
        String toCity = scanner.nextLine();
        
        // Take user input for distances in miles
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();
        
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();
        
        // Calculate total distance
        double totalDistance = fromToVia + viaToFinalCity;
        
        // Output the travel details and total distance
        System.out.println("\nTravel Details:");
        System.out.println("Traveler: " + name);
        System.out.println("From: " + fromCity);
        System.out.println("Via: " + viaCity);
        System.out.println("To: " + toCity);
        System.out.println("Distance from " + fromCity + " to " + viaCity + ": " + fromToVia + " miles");
        System.out.println("Distance from " + viaCity + " to " + toCity + ": " + viaToFinalCity + " miles");
        System.out.println("Total distance to travel: " + totalDistance + " miles");
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
