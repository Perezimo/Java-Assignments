//2.28
import java.util.Scanner;
public class RadiusOfCircle{
public static void main(String [ ] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Radius");
	
	int radius = input.nextInt();
	double diameter = 2 * radius;
	double circumference = 2* 3.14159 * radius;
	double area = 3.14157 * radius*radius;
	System.out.printf("The diameter is %f%n", diameter);
	System.out.printf("The circumference is %f%n" , circumference);
	System.out.printf("The area is %f%n", area);
}
}