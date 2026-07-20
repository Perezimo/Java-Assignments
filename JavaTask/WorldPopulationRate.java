//2.34
import java.util.Scanner;
public class WorldPopulationRate{
public static void main(String [ ] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter World Population:");
	double Population= input.nextDouble();
	System.out.println("Enter Rate:");
	double Rate= input.nextDouble();
	
	double Year1 = Population * Rate/100;
	double NewPopulation1 = Year1 + Population;
	System.out.println("The current population after one year is " +NewPopulation1);
	double NewPopulation2 = NewPopulation1 + Population;
	System.out.println("The current population after two years is "+ NewPopulation2);
  
	double NewPopulation3 = NewPopulation2 + NewPopulation1;
	System.out.println("The current population after one year " + NewPopulation3);
  
double NewPopulation4 = NewPopulation3 + NewPopulation2;
	System.out.println("The current population after three years " + NewPopulation4);
double NewPopulation5 = NewPopulation4 + NewPopulation3;
	System.out.println("The current population after five years " +NewPopulation5);

}
}  
  

