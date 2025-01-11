import java.util.Scanner;

public class TemperaturConversion {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter temperature ");
        float Celsius = obj.nextInt();

        float fahrenheit =  ( Celsius * 9/5 ) + 32;

        // Display the result
        System.out.println("The "+Celsius+ " celsius is "+ fahrenheit +" fahrenheit" );
       
    }
}
