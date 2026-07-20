/*Question21.Prompt user to enter a number
		if number is greater than zero
		print positive
*/

import java.util.Scanner;
public class NumbGreaterZero{
public static void main(String [] agrs){


Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a Number:  ");
	int number = input.nextInt();
	
	if(number>0)
	System.out.println("Positive");
}
}