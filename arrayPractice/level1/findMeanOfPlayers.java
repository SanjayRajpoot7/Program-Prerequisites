import java.util.Scanner;

public class findMeanOfPlayers{

  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);

    double[] newArray = new double[11]; 
    
    int i;
    System.out.println("Enter number: ");

    for(i=0; i < newArray.length ; i++){
    newArray[i] = obj.nextInt();
   
    }
    
    int sum = 0;
    for(i=0; i < newArray.length ; i++){
    sum += newArray[i];
   
    }
    System.out.println();
    System.out.println(sum/11+" ");

}
}