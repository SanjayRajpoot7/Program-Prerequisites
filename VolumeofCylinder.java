import java.util.*;
public class VolumeofCylinder
{

   public static double calculateVolume(double radius, double height)
    {
        return 3.14 * radius * radius * height; 
     }

   public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter radius ");
        double radius = scanner.nextDouble();
        
        System.out.println("Enter height ");
        double height = scanner.nextDouble();


     VolumeofCylinder obj1= new VolumeofCylinder();
     double value=obj1.calculateVolume(radius,height);

     System.out.println(value+" ");
   }
}

    
    
        
       