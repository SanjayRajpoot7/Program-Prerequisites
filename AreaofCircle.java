import java.util.*;
public class AreaofCircle
{
   public static void main(String[] args){
     Scanner obj1 = new Scanner(System.in);
     System.out.println("Enter radius ");
     int radius=obj1.nextInt();
     double area= 3.14*radius*radius;

      System.out.println(area+" ");
   }
}