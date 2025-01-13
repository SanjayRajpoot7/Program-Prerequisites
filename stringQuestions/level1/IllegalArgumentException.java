import java.util.Scanner;


public class IllegalArgumentException{

public static void generateException(String text, int startIndex, int endIndex)
{
   String substring = text.substring(startIndex, endIndex);
   System.out.println("substring: "+substring);

}

  public static void handleException(String text, int startIndex, int endIndex)
{
   try{
       generateException(text, startIndex, endIndex);
    }

   catch(StringIndexOutOfBoundsException e){
     System.out.println("Caught Exception: IllegalArgumentException");
     System.out.println("Error message: " + e.getMessage());
  }
  catch(Exception e){
   System.out.println("Caught a runtime exception "+e.getMessage());
  }

  
  
}

     

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any string: ");

        String text = scanner.next();

        System.out.print("Enter start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = scanner.nextInt();

       generateException(text, startIndex, endIndex);
        
      
    }
}
