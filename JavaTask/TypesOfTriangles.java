//Question43.

import java.util.Scanner;
public class TypesOfTriangles{
public static void main(String [] agrs){
     Scanner input = new Scanner(System.in);

	System.out.print("Enter a side of the triangle:  ");
	int firstSide = input.nextInt();

         System.out.print("Enter second side of the triangle:  ");
	  int secondSide = input.nextInt();
	
	System.out.print("Enter third side of the triangle:  ");
	  int thirdSide = input.nextInt();
	

	if(firstSide==secondSide&&secondSide==thirdSide){
		System.out.println("This is an Equilateral Triangle");
		}
	else if(firstSide==secondSide&&secondSide!=thirdSide){
			System.out.println("This is an Isosceles Triangle");
		}
	else if(firstSide!=secondSide&&secondSide!=thirdSide){
			System.out.println("This is a Scalene Triangle");
		}

	else{
			System.out.println("Invalid, does not form a valid 			triangle");
		}
 }
}
		

	