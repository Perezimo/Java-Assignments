import java.util.Scanner;
public class TempCoversion{
public static void main (String [ ] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Enter temperature in census:");
	double Census = input.nextDouble();
	double Fahrenheit = (Census * 1.8) + 32;
	System.out.print(Census + " " + "degree"  + " " + "is" + " " + Fahrenheit + "F");
}
}
	
