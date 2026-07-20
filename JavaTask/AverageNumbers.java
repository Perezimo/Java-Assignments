import java.util.Scanner;
public class AverageNumbers{

public static void main (String [] args){

	Scanner input = new Scanner(System.in);	
		
	
	int total = 0;
	int averageCount = 1;

	while(averageCount <=100){

	total = total + averageCount;
	averageCount++;

 }
	int average = total/100;
	System.out.println("The average of 100 numbers is" + average);
}
}	
		