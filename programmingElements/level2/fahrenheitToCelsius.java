import java.util.Scanner;

public class fahrenheitToCelsius {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter fahrenheit ");
        float fahrenheit = obj.nextInt();

        float celsius =  ( fahrenheit - 32 ) * 5/9;

        // Display the result
        System.out.println("The "+fahrenheit+ " fahrenheit is "+ celsius +" celsius" );
       
    }
}
