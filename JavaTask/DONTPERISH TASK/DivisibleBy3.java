import java.util.Scanner;
public class DivisibleBy3{
public static void main(String [] agrs){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer:");
    int number1 = input.nextInt();
   
    boolean divBy3Result = divisibleBy3(number1);
    
    System.out.println(divBy3Result);


}

public static boolean divisibleBy3(int number){

    if ( number %3 == 0 ) {

      
          return true;
    }

    else { 
        
            return false;
        } 
     }
}
