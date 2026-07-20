/*Question48
*/
import java.util.Scanner;
public class DoWhilePrompt{
public static void main(String [] agrs){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = input.nextInt();
	
	
	do {
	     	//System.out.printf("%d  ", number);
		++number;
		 
	} while (number>5);
	System.out.printf("%d  ", number);		
     }
}