import java.util.Scanner;

public class compareArrays {


  public static boolean comparingTwoArrays(char[] charArray, char[] newArray)
{
   if(charArray.length != newArray.length){
    return false;
   }
 
   for(int i = 0; i < charArray.length; i++){

   if(charArray[i] != newArray[i]){
   return false;
   }
  }
   return true;
   
  
}


   public static char[] userDefined(String text){
   
   char[] newArray = new char[text.length()];

   for(int i = 0; i < text.length(); i++){
   newArray[i] = text.charAt(i);

  }
  return newArray;
}

     

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        char[] customArray = userDefined(text);

        char[] charArray = text.toCharArray();

        boolean areArraysEqual = comparingTwoArrays(customArray, charArray);
       
        if(areArraysEqual){
         System.out.print("Both of arrays character or length equal ");
        }
        else{
         System.out.print("Both of arrays character or length are not equal");
        }
        
        
    }
}
