import java.util.Scanner;
// import java.util.*;

public class findLengthOfTwoString{

  
 public static int userDefined(String text){
   
   int length = 0;

   try{
        for (int i = 0; i < text.charAt(i); i++) {
          length++;
        }
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Exception found: "+e.getMessage());
            
        }
 return length;
}
   
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a string: ");
    String text = scanner.nextLine();

    int store = userDefined(text);
    System.out.println("This length found by user defined method: "+store);

    int findLength = text.length();
    System.out.println("This length found by built-in method: "+findLength);
   }


}
    