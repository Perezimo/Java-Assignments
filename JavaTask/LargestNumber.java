/*Question33
*/

import java.util.Scanner;
public class LargestNumber{
public static void main(String [] agrs){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first number:  ");
	int number1 = input.nextInt();

	System.out.print("Enter second number:  ");
	int number2= input.nextInt();
	System.out.print("Enter Units: ");
	int number3 = input.nextInt();
	

	if(number1>number2 && number1 > number3){
		System.out.println("The largest number is:" + number1);
		}
	else if (number2>number1 && number2>number3){
		System.out.println("The largest number is:" + number2);
	
		}	
	else if (number3>number1 && number3>number2){
		System.out.println("The largest number is:" + number3);
		}

	
	}
}
