import java.util.Scanner;
public class DivisorOfNumber{

public static void main (String [] args){

	Scanner input = new Scanner(System.in);	

	System.out.print("Enter a number to know possible divisor: ");

	int number = input.nextInt();
	System.out.print("Enter a divisor:  ");

	int divisor = input.nextInt();

	if(number%divisor==0){
		System.out.printf("The number is divisible by"  + divisor);
	}
	else{
		System.out.print("Number not divisible by "  + divisor);
		}
}
	 
}
