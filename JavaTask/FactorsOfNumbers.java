import java.util.Scanner;
public class FactorsOfNumbers{
public static void main(String [] agrs){

 	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number:  ");
	
	int number = input.nextInt();
	
	
	for(int counter = 1 ; counter<=number; counter++){

		if(number% counter ==0){
		 
			System.out.println(counter + "");

		}

	}
}
}

		