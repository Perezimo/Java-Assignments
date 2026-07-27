import java.util.Scanner;
public class DivisibleBy3{
public static void main(String [] agrs){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer:");
    int number1 = input.nextInt();
   
    boolean divBy3Result = divisibleBy3(number1);
    
    System.out.println(divBy3Result);


}

public static boolean divisibleBy(int number){
for (int count = 0; count<=number; count ++){
    if ( number %count== 0 ) {

      
          return true;
    }

    else { 
        
            return false;
        } 
     }
  }
}
