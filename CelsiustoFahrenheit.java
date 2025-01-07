import java.util.*;
public class CelsiustoFahrenheit
{
   public static void main(String[] args){
     Scanner obj1 = new Scanner(System.in);
     System.out.println("Enter temperature ");
     int celsius=obj1.nextInt();
     int Fahrenheit = (celsius * 9/5) + 32;

      
      System.out.println(Fahrenheit+" ");
   }
}