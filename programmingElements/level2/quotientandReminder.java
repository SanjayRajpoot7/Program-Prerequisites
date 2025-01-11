import java.util.Scanner;
public class quotientandReminder {
    public static void main(String[] args) {

      Scanner obj = new Scanner(System.in);
      System.out.print("Enter first number ");
        //First user
        int number1 = obj.nextInt();

        System.out.print("Enter second number ");
        // Second user
        int number2 = obj.nextInt();

        // For quotient
        int quotient = number1 / number2;

        // For remainder
        int remainder = number1 % number2;

        // Display the result
        System.out.println("The quotient is "+ quotient +" and remainder is "+remainder+" of two number "+number1+" and "+ number2);
       
    }
}
