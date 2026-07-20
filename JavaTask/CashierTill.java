/*Question 14. Enter price
		enter quantity
		compute subtotal
		compute vat
		copute grandtotal
		print grandtotal*/

import java.util.Scanner;
public class CashierTill{
public static void main(String [] agrs){


Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Price :  ");
	double  price = input.nextDouble();
	
	System.out.print("Enter Quantity:  ");

	double quantity = input.nextDouble();
	double subTotal = price * quantity;
	double vat = subTotal * 0.02;
	double grandTotal= subTotal + vat;

	System.out.println("The grand total cost is:" + grandTotal);

   }
}
