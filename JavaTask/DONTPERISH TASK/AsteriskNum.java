

 import java.util.Scanner;
public class AsteriskNum{
public static void main(String [] agrs){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first integer: ");
    int firstNumber= input.nextInt();
 
    String asteriskResults = asteristNumbers(firstNumber);
    System.out.println(asteriskResults);

    
}

 public static  String asteristNumbers (int number){
            String asterisks = "";
            

            for(int count=0;count<number;count++){
                asterisks+="*";
                }
            return asterisks;

}
}
