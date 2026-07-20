
import java.util.Scanner;
public class MultipliNumber{
public static void main(String [] agrs){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number:" );
	int number = input.nextInt();

for( number = 1; number<=12; number++){

	//System.out.print("Enter a number:" );
	
	number = number*number;
	//System.out.print(number);
	
	}
	System.out.print(number);	
     }
}