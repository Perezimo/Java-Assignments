/*Question22.Prompt for the user to enter a number 
		if the number module two is equal zero
		print number is Even
		else
		print number is Odd


*/

import java.util.Scanner;
public class EvenOrOddNumber{
public static void main(String [] agrs){


Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a Number:  ");
	int number = input.nextInt();
	
	if(number%2==0){
		
		System.out.println("Even");
		}
	else{
		System.out.println("Odd");
		}
	}
}
		

