import java.util.Scanner;

public class YoungestAndTallestFriend {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create arrays to store ages and heights of the 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        // Input age and height for each friend
        System.out.print("Enter age of Amar: ");
        ages[0] = scanner.nextInt();
        System.out.print("Enter height of Amar (in cm): ");
        heights[0] = scanner.nextDouble();
        
        System.out.print("Enter age of Akbar: ");
        ages[1] = scanner.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        heights[1] = scanner.nextDouble();
        
        System.out.print("Enter age of Anthony: ");
        ages[2] = scanner.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        heights[2] = scanner.nextDouble();

        // Find the youngest friend
        int youngestAge = ages[0];
        int youngestIndex = 0;

        // Find the tallest friend
        double tallestHeight = heights[0];
        int tallestIndex = 0;

        // Loop through the arrays to find the youngest and tallest friend
        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestIndex = i;
            }
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestIndex = i;
            }
        }

        // Display the youngest friend and the tallest friend
        System.out.println("\nThe youngest friend is: " + getFriendName(youngestIndex));
        System.out.println("Age: " + youngestAge + " years");

        System.out.println("\nThe tallest friend is: " + getFriendName(tallestIndex));
        System.out.println("Height: " + tallestHeight + " cm");

        // Close the scanner
        scanner.close();
    }

    // Helper method to return the name of the friend based on the index
    public static String getFriendName(int index) {
        switch (index) {
            case 0: return "Amar";
            case 1: return "Akbar";
            case 2: return "Anthony";
            default: return "Unknown";
        }
    }
}
