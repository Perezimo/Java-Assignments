import java.util.Scanner;
	public class RectangleCal{
	public static void main(String[ ] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the length of the rectangle:");
	double length = input.nextDouble();
	System.out.println("Enter the breadth of the rectangle:");
	double breadth = input.nextDouble();
	Double Area = length * breadth;
	double Parimeter = 2*(length + breadth);
	System.out.println("The Area of a Rectangle is:" + Area);
	System.out.println("The Parimeter of a Rectangle is:" + Parimeter);
	
}
}
