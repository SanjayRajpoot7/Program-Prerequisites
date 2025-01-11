import java.util.Scanner;

  public class reverseArray{
   
       public static void main(String[] args){

          Scanner obj = new Scanner(System.in);
          System.out.println("Enter array size: ");

          int size = obj.nextInt();
          int originalArray[] = new int[size];

          for(int i = 0; i < originalArray.length; i++){
             originalArray[i] = obj.nextInt();
           }
           
           int[] reverseArray = new int[size];
           int p = 0;
           for(int i = originalArray.length - 1; i >= 0; i--){
           reverseArray[p++] = originalArray[i];
           }
 
           System.out.print("Original Array: ");
           for(int j : originalArray){
           System.out.print(j+" ");
           }
 

           System.out.println();         

           System.out.print("Original Array: ");
           for(int k : reverseArray){
           System.out.print(k+" ");
           }
  }
}
           