/*Question31.

*/

import java.util.Scanner;
public class UnitCost{
public static void main(String [] agrs){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Units:  ");
	int unit = input.nextInt();
	int bill = 0;

	if(unit<=100){
		bill = unit * 50;
		System.out.println(bill);
		}
	else if (unit>100 && unit <=300){
		bill = unit * 75;
		System.out.println(bill);
		}
	else if (unit>=300){
		bill = unit * 100;
		System.out.println(bill);
		}
	}
}
