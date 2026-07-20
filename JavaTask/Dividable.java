//2.25
import java.util.Scanner;
public class Dividable{
public static void main(String [ ] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number");
	double Result = input.nextDouble();
	
	if (Result % 3 == 0){
	System.out.println("The number is dividable by 3");
	}
	if (Result % 3 !=0) {
	System.out.println("The number is not dividable by 3");
	}
}
}
 
