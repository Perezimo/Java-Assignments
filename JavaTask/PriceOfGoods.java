/*QUESTION7
	Read price from user
	compute tax as price * 0.07
	compute total as price + tax
	print total.
 */

import java.util.Scanner;
public class PriceOfGoods{
public static void main(String [] agrs){


Scanner input = new Scanner(System.in);
	
	System.out.print("Enter price:  ");
	double price = input.nextDouble();

	double tax = price*0.07;
	
	double total = price + tax;
	
	System.out.println("The total price for the good is:" + total);
   
  }
}
	