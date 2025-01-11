import java.util.Scanner;
public class doubleOpt {
    public static void main(String[] args) {

      Scanner obj = new Scanner(System.in);
      System.out.print("Enter first number ");
        //First user
        double a = obj.nextDouble();

        System.out.print("Enter second number ");
        // Second user
        double b = obj.nextDouble();

        System.out.print("Enter third number ");
        // Third user
        double c = obj.nextDouble();

        

        // Display the result
        System.out.println("operations a + b *c = "+ a + b * c);
        System.out.println("operations a * b + c = "+ a * b + c);
        System.out.println("operations c + a / b = "+ a + b / c);
        System.out.println("operations a % b + c = "+ a % b + c);
       
    }
}
