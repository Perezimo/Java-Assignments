/*Question40
*/
import java.util.Scanner;
public class IncomeTax{
public static void main(String [] agrs){
     Scanner input = new Scanner(System.in);

	System.out.print("Enter Income:  ");
	double income = input.nextDouble();
	double tax = 0;
	if(income<=300000){
		
		System.out.println("No tax");
	}
	if(income >300000&&income<=600000){
		tax = income * 7/100;
		System.out.println("Your total tax due is: " + tax);
		}
	if(income >600000){
		tax = income * 15/100;
		System.out.println("Your total tax due is:" + tax);
		}
	
	}
}

