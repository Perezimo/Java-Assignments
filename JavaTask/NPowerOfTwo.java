import java.util.Scanner;

public class NPowerOfTwo{
public static void main(String [] agrs){

Scanner input = new Scanner(System.in);

System.out.print("Enter the nth number: ");

	int number = input.nextInt();
 for(int count = 1; count<= number; count++){
 	
	 double result = Math.pow(2 , count);
	
	System.out.printf("%.0f  ", result);
	System.out.println();
	}
	
	}
}