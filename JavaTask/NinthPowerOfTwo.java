import java.util.Scanner;
public class NinthPowerOfTwo{
public static void main(String [] agrs){

 	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number:  ");
	
	int number = input.nextInt();
	int base =2;
	int counter = number;
	

	for(counter = 1 ; counter<= Math.pow(base, number); counter++){

		System.out.print(number);

	}
}
}

		