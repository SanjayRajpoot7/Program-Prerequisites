import java.util.Scanner;


public class checkArrayIndexOutOfBoundsException{


 public static void generateException(String[] names)
 {
   System.out.println("Accessing value: "+names[100]); 

 }

  public static void handleException(String[] names)
 {
   try{
       generateException(names);
    }

   catch(ArrayIndexOutOfBoundsException e){
     System.out.println("Caught Exception: ArrayIndexOutOfBoundsException");
     System.out.println("Error message: " + e.getMessage());
  }
  catch(Exception e){
   System.out.println("Caught a runtime exception "+e.getMessage());
  }

}

     

    public static void main(String[] args){

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter names: ");

        String[] names = new String[5];

        for(int i = 0; i < names.length; i++){
        names[i] = scanner.nextLine();
        }

        generateException(names);
        
    }
}
