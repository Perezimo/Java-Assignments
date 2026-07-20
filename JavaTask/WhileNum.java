//QUESTION52.

import java.util.Scanner;
public class WhileNum{
public static void main(String [] agrs){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = input.nextInt();
	int sum = 0;
	
  while(number!=-1){
		System.out.println("Enter a number: ");
	        number = input.nextInt();
		sum = sum + number;
		number++;
		}
		System.out.printf("%d   ", number);

}

}