/* Pseodocode.
Let a user enter a positive  number;
get the sum of the numbers entered
If number is not less than 0;
get more numbers
if number enetred is less than 0;
exit and print the average of the numbers'
*/


import java.util.Scanner;
public class CheckPositiveNumber{
public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	
	double count =0;
	//int number;
	int sum = 0;
	while(true) {
		
	System.out.print("Enter a positive number:" );
	int number = input.nextInt();
		if (number <0){
			break;
		}
		 sum = sum + number;
			count++;
		}		

			if (count>0){
			double average = (double) sum/count;

		System.out.println(average);
		
		}
		

		//System.out.println(average);
	
	}
}