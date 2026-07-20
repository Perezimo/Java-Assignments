/*Question8
	enter radius from user
	computes area as PI*radius*radius
	print area
*/

import java.util.Scanner;
public class AreaOfCircle{
public static void main(String [] agrs){


Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the radius:  ");
	double radius = input.nextDouble();

	double area = Math.pow(radius,2)*22/7;

	System.out.printf("The area of the circle is %.2f" , area);
  }

}

