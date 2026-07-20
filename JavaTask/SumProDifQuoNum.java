/*Prompt user to enter first number, number1
  prompt user to enter second number, number2
 sum equal number1 + number2
	difference equal number1 - number2
	product equales number1*number2
	quotient equals number1 / number2
	print sum
	print difference
	print product
	print quotient 
*/

import java.util.Scanner;
public class SumProDifQuoNum{
public static void main(String [] agrs){


Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the first number:  ");
	int number1 = input.nextInt();

	
	System.out.print("Enter the second:  ");
	int number2 = input.nextInt();

	int sum = number1 + number2;
	
         int difference = number1 - number2;

	int product = number1 * number2;
	
        int quotient = number1/number2;

	        System.out.println(" The sum of the two numbers is: " +sum);

		System.out.println("The difference of the two number is: " + difference );

		System.out.println("The product of the two numbers is:" + product );

		System.out.println("The quotient of the two numbers is:" + quotient);
    }
}