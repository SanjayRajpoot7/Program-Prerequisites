import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        // Math.random() generates a number between 0.0 (inclusive) and 1.0 (exclusive)
        // Multiply by 900000 to get a range of values from 0 to 899999 and add 100000 to shift the range to 100000 to 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check if the OTP numbers are unique
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> otpSet = new HashSet<>(); // Set automatically handles uniqueness

        // Add each OTP to the set
        for (int otp : otps) {
            otpSet.add(otp);
        }

        // If the size of the set is equal to the array length, all OTPs are unique
        return otpSet.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTP numbers
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otps[i]);
        }

        // Check if the OTP numbers are unique
        boolean unique = areOTPsUnique(otps);

        // Display the result
        if (unique) {
            System.out.println("\nAll OTP numbers are unique.");
        } else {
            System.out.println("\nThere are duplicate OTP numbers.");
        }
    }
}
