import java.util.Scanner;

public class ConvertToLowercase {

   public static boolean checkBothString(String convertByUsingUserDefined, String convertByUsingBuiltIn){

    if(convertByUsingUserDefined.equals(convertByUsingBuiltIn)){
    return true;
    }
  return false;
}

    
    public static String convertToUpperCaseUsingCharAt(String text) {
      StringBuilder lowerCaseText = new StringBuilder();
    

     for(int i = 0; i < text.length(); i++){
       char ch = text.charAt(i);


      if(ch >= 'A' && ch <= 'Z'){
       ch = (char) (ch + 32);

     }
     lowerCaseText.append(ch);
  }
return lowerCaseText.toString();
}


 public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a string: ");
    String text = scanner.nextLine();

    String convertByUsingUserDefined = convertToUpperCaseUsingCharAt(text);
    String convertByUsingBuiltIn = text.toLowerCase();


    boolean  areStringsEqual = checkBothString(convertByUsingUserDefined, convertByUsingBuiltIn);

     System.out.println("Converted using charAt method: " + convertByUsingUserDefined);
        System.out.println("Converted using built-in toUpperCase method: " + convertByUsingBuiltIn);

    System.out.println("Are both methods' results equal? " + (areStringsEqual ? "Yes" : "No"));
   }
}
    