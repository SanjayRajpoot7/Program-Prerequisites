import java.util.Scanner;

public class CollinearPointsChecker {

    // Method to check if the three points are collinear using the slope formula
    public static boolean arePointsCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the slopes of AB, BC, and AC
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Points are collinear if the slopes of AB, BC, and AC are equal
        return (slopeAB == slopeBC && slopeAB == slopeAC);
    }

    // Method to check if the three points are collinear using the area of the triangle formula
    public static boolean arePointsCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area of the triangle formed by the points
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // Points are collinear if the area of the triangle is zero
        return (area == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the coordinates of the three points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        // Check if the points are collinear using both methods
        boolean collinearBySlope = arePointsCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean collinearByArea = arePointsCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Output the result
        if (collinearBySlope && collinearByArea) {
            System.out.println("The points (" + x1 + "," + y1 + "), (" + x2 + "," + y2 + "), and (" + x3 + "," + y3 + ") are collinear.");
        } else {
            System.out.println("The points (" + x1 + "," + y1 + "), (" + x2 + "," + y2 + "), and (" + x3 + "," + y3 + ") are NOT collinear.");
        }

        scanner.close();
    }
}
