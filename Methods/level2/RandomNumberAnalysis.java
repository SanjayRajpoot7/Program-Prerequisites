import java.util.Arrays;

public class RandomNumberAnalysis {

    // Method to generate an array of random 4-digit numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate a random number between 1000 and 9999
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return randomNumbers;
    }

    // Method to find the average, minimum, and maximum value in the array
    public static double[] findAverageMinMax(int[] numbers) {
        double[] results = new double[3];
        
        // Calculate the average
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = sum / numbers.length;
        
        // Find the minimum and maximum using Math.min() and Math.max()
        int min = numbers[0];
        int max = numbers[0];
        
        for (int num : numbers) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        // Store results in the array: [average, min, max]
        results[0] = average;
        results[1] = min;
        results[2] = max;
        
        return results;
    }

    public static void main(String[] args) {
        // Generate 5 random 4-digit numbers
        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);
        
        // Find the average, min, and max
        double[] results = findAverageMinMax(randomNumbers);
        
        // Display the results
        System.out.println("Generated Random Numbers: " + Arrays.toString(randomNumbers));
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
