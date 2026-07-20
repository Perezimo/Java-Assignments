/*Question15.Enter distance in miles
		convert distance to kilometers
		print distance in mile
		print distance in kilometer

*/

import java.util.Scanner;
public class KiloMeterMiles{
public static void main(String [] agrs){


Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Distance in Miles:  ");
	double  distance = input.nextDouble();

	double distInKilometer = distance/1.60934;
	
	System.out.printf("The distance in Kilometer is %.2f%n:" , distInKilometer);
	System.out.printf("The distance in Miles is %.2f:" , distance);
	
   }
}