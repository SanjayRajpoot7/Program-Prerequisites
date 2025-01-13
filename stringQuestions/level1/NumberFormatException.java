import java.util.Scanner;


public class NumberFormatException{

public static void generateException(String text)
{
   int extractNumber = Integer.parseInt(text);
   System.out.println("Extracting number: "+extractNumber);

}

  public static void handleException(String text)
{
   try{
       generateException(text);
    }

   catch(StringIndexOutOfBoundsException e){
     System.out.println("Caught Exception: NumberFormatException");
     System.out.println("Error message: " + e.getMessage());
  }
  catch(Exception e){
   System.out.println("Caught a runtime exception "+e.getMessage());
  }

}

     

    public static void main(String[] args){

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any string: ");

        String text = scanner.next();

        generateException(text);
        
      
    }
}
