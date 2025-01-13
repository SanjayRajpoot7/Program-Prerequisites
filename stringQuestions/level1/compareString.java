import java.util.Scanner;

  public class compareString{

     public static void main(String[] args){
      
      Scanner obj = new Scanner(System.in);

      System.out.println("Enter first string: ");
      String firstString = obj.next();

      System.out.println("Enter second string: ");
      String secondString = obj.next();

      boolean b = charAt(firstString,secondString);
      System.out.println("Both of string is same: "+b);

      }

   public static boolean charAt(String firstString, String secondString){
   
    if(firstString.equals(secondString)){
      return true;
     }
     
    return false;
  }



}