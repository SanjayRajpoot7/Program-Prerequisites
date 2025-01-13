import java.util.Scanner;

public class ArrayIndexOutOfBoundsExample {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        try {
            // Trying to access an invalid index, which is beyond the array length
            System.out.println("Accessing an invalid index: " + names[10]); // This will throw an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catching ArrayIndexOutOfBoundsException and printing the error
            System.out.println("Caught Exception: ArrayIndexOutOfBoundsException");
            System.out.println("Error message: "+e.getMessage());
        } catch (Exception e) {
            // Catching other generic exceptions
            System.out.println("Caught a generic exception: "+e.getMessage());
        }
    }

    // Method to get the array from the user
    public static String[] getArrayFromUser() {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the size of the array
        System.out.print("Enter the number of names you want to input: ");
        int size = scanner.nextInt();
        scanner.nextLine();  // Consume the leftover newline

        // Creating the array of names
        String[] names = new String[size];

        // Taking input for each name
        System.out.println("Enter the names:");
        for (int i = 0; i < size; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        return names;
    }

    public static void main(String[] args) {
        // Get the array of names from the user
        String[] names = getArrayFromUser();

        // Call the method to generate the exception
        generateException(names);

        
    }
}
