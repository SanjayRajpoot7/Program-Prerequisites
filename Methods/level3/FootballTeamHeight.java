import java.util.Arrays;

public class FootballTeamHeight {

    // Method to generate random heights for players between 150 and 250 cms
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate a random height between 150 and 250
            heights[i] = (int) (Math.random() * 101) + 150; // (0 to 100) + 150
        }
        return heights;
    }

    // Method to find the sum of all elements in the array
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height
    public static double findMeanHeight(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortestHeight(int[] heights) {
        int minHeight = heights[0];
        for (int height : heights) {
            minHeight = Math.min(minHeight, height);
        }
        return minHeight;
    }

    // Method to find the tallest height
    public static int findTallestHeight(int[] heights) {
        int maxHeight = heights[0];
        for (int height : heights) {
            maxHeight = Math.max(maxHeight, height);
        }
        return maxHeight;
    }

    public static void main(String[] args) {
        // Size of the team
        int teamSize = 11;

        // Generate random heights for the football team
        int[] heights = generateHeights(teamSize);

        // Find the sum, mean, shortest, and tallest heights
        int sum = findSum(heights);
        double mean = findMeanHeight(heights);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);

        // Display the results
        System.out.println("Football Team Heights (in cms): " + Arrays.toString(heights));
        System.out.println("Sum of all heights: " + sum + " cms");
        System.out.println("Mean height: " + mean + " cms");
        System.out.println("Shortest height: " + shortest + " cms");
        System.out.println("Tallest height: " + tallest + " cms");
    }
}
