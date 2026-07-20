import java.util.Scanner;
public class CountDown{
public static void main(String [] agrs){

 	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number:  ");
	
	int number = input.nextInt();
	for (int counter = number ; counter >=1; counter--){

		System.out.println(counter);

	}
		System.out.println("Blast off!");
}
}

		