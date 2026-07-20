//QUESTION42.

import java.util.Scanner;
public class DivNumBy3{
public static void main(String [] agrs){
     Scanner input = new Scanner(System.in);

	System.out.print("Enter a number:  ");
	int number = input.nextInt();
	
	if(number%3==0&&number%5==0){

		System.out.println("The number is divisible by 3 and 5:" + 		number);
		}
		
	else if(number%3==0&&number%5!=0){

		System.out.println("The number is divisible by 3 only:" + 		number);
		}
	else if(number%3!=0&&number%5==0){

		System.out.println("The number is divisible by 5 only:" + 		number);
		}
	
	else{
		System.out.println("The number is not divisible by either");
		}
	}
}