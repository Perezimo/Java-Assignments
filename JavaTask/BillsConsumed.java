import java.util.Scanner;
public class BillsConsumed{
public static void main(String [ ] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Unit consumed");
	double UnitConsumed=input.nextDouble();

	if(UnitConsumed <=100){
		double TotalUnit = (UnitConsumed * 10);
		System.out.print("Total unit consumed" + TotalUnit);
		}
	if (UnitConsumed >=101 && UnitConsumed<=300){
		double TotalUnit = (UnitConsumed * 15);
		System.out.print("Total unit consumed" + TotalUnit);
   		}
	if (UnitConsumed >=300){
	
		double TotalUnit = (UnitConsumed * 20);
		System.out.print("Total unit consumed" + TotalUnit);
	}

}
}