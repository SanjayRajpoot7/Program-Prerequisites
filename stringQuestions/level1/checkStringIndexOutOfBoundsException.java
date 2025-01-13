import java.util.Scanner;
// import java.lang.Math;

public class checkStringIndexOutOfBoundsException{


  public static String generateException(String text)
{
   try{
       int length = text.charAt(1000);
    }

   catch(StringIndexOutOfBoundsException e){
    System.out.println("StringIndexOutOfBoundsException rasied "+e.getMessage());
  }
  catch(Exception e){
   System.out.println("Exception found "+e.getMessage());
  }
return null;
  
  
}

     

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any string: ");

        String text = scanner.next();
        generateException(text);
        
      
    }
}
