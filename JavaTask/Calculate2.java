import java.lang.Math;
import java.util.Scanner;
         public class Calculate{
         public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value for a:");
		double a = input.nextDouble();
		System.out.println("Enter the value for b:");
		double b = input.nextDouble();
		System.out.println("Enter the value for c:");
		double c = input.nextDouble();
	double x = -b + (Math.sqrt(b*b  + 4 * a *c) / 2*a);
	System.out.print("The value of x is:" +  x);
}
}
	
