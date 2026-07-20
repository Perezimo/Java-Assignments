import java.util.Scanner;

public class FarenheitCensus{

   public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter value in Farenheit" );

	double farenheit = input.nextDouble();
	double Census = (5.0/9) * (farenheit - 32);
	System.out.print("The value of :" + farenheit + "F" + " is"+ " " + Census + "C");
}
}

	
	