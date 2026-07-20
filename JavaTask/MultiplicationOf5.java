/*
Question3. Program that generate multiplication of 5 table*/

Enter number
inititialize counter to 1
for counter is less than equals 12,
increament counter
print number multiplication by counter*/


import java.util.Scanner;
public class MultiplicationOf5{
public static void main(String [] agrs){
 	Scanner input = new Scanner(System.in);
	System.out.print("Enter 5 as a number:  ");
	int number = input.nextInt();

	
	for(int counter = 1 ; counter <=12; counter++){

		
	System.out.printf("%d x %d = %d\n" , number , counter, (number * counter));

	}
}

} 