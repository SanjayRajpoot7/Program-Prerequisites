
import java.util.*;
public class PerimeteofRectangle
{
   public static void main(String[] args){
     Scanner obj = new Scanner(System.in);

     System.out.println("Enter length ");
     int length=obj.nextInt();

     System.out.println("Enter width ");
     int width=obj.nextInt();

     float perimeter=length*width;

      System.out.println(perimeter+" ");
   }
}