//2.35
import java.util.Scanner;
public class GreatPyramid{
public static void main(String [ ] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number of stones used:");
	double Stones= input.nextDouble();
	System.out.println("Enter Rate:");
	double AveWeightOfStone= input.nextDouble();
	System.out.println("Enter Years:");
	double Years= input.nextDouble();
	
	double EachYear= Stones*AveWeightOfStone/27;
	System.out.println("The weight of Pyramid built each year is " + EachYear);
	double EachHour = Stones*AveWeightOfStone/8760*27;
System.out.println("The weight of Pyramid built each hour is " + EachHour);
	double EachMinutes = Stones*AveWeightOfStone/525600*27;
System.out.println("The weight of Pyramid built each minutes is " + EachMinutes);
	

}
}

