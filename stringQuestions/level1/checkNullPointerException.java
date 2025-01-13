import java.util.Scanner;

public class checkNullPointerException{


  public static String generateException(String text)
{
   try{
       text.substring(0,2);
    }

   catch(NullPointerException e){
    System.out.println("NullPointerException rasied "+e.getMessage());
  }
  catch(Exception e){
   System.out.println("Exception found "+e.getMessage());
  }
return null;
  
  
}

     

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        String text = null;
        generateException(text);
        
      
    }
}
