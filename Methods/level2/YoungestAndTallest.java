import java.util.Scanner;

public class YoungestAndTallest {

    // Method to find the youngest among the 3 friends
    public static String findYoungest(String[] friends, int[] ages) {
        int minAge = ages[0];
        int youngestIndex = 0;

        // Loop through the ages to find the minimum age and the index of the youngest
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestIndex = i;
            }
        }

        return friends[youngestIndex];  // Return the name of the youngest friend
    }

    // Method to find the tallest among the 3 friends
    public static String findTallest(String[] friends, double[] heights) {
        double maxHeight = heights[0];
        int tallestIndex = 0;

        // Loop through the heights to find the maximum height and the index of the tallest
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }

        return friends[tallestIndex];  // Return the name of the tallest friend
    }

    public static void main(String[] args) {
        // Create scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Names of the friends
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take user input for ages and heights
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter height of " + friends[i] + " in meters: ");
            heights[i] = scanner.nextDouble();
        }

        // Find the youngest friend
        String youngest = findYoungest(friends, ages);
        System.out.println("The youngest friend is: " + youngest);

        // Find the tallest friend
        String tallest = findTallest(friends, heights);
        System.out.println("The tallest friend is: " + tallest);

        // Close the scanner
        scanner.close();
    }
}
