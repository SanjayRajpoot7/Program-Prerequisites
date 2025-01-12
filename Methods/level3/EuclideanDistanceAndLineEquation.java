import java.util.Scanner;

public class EuclideanDistanceAndLineEquation {

    // Method to find the Euclidean distance between two points (x1, y1) and (x2, y2)
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Calculate the Euclidean distance using the formula
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the equation of a line given two points (x1, y1) and (x2, y2)
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Calculate the slope (m) using the formula (y2 - y1) / (x2 - x1)
        double slope = (y2 - y1) / (x2 - x1);

        // Calculate the y-intercept (b) using the formula b = y1 - m*x1
        double yIntercept = y1 - slope * x1;

        // Return the slope and y-intercept in an array
        return new double[]{slope, yIntercept};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the coordinates of the two points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate the Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between the two points: " + distance);

        // Calculate the line equation (slope and y-intercept)
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];

        // Display the equation of the line
        System.out.println("Equation of the line: y = " + slope + "x + " + yIntercept);

        scanner.close();
    }
}
