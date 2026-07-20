/*Question27.
Prompt the user for the first number
prompt the user for the second number
if the firdt number is greater than second number,
print the fisrt number is greater
else if, the second number is greater, print the second number is greater
else, print the numbers are equal


*/
import java.util.Scanner;
public class CompareNumbers{
public static void main(String [] agrs){


Scanner input = new Scanner(System.in);
	System.out.print("Enter the first number:  ");
	int number1 = input.nextInt();

	System.out.print("Enter the second number:  ");
	int number2= input.nextInt();

      if(number1 > number2){
		System.out.println("First number is greater: " + number1);
		}
	else if(number2 >number2){
		System.out.println("Second number is greater: " + number2);
		}
	else {
		System.out.println("The numbers are equal");
		}
	}
}