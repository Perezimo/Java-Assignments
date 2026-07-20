//2.34
import java.util.Scanner;
public class WorldPopulationRate{
public static void main(String [ ] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter World Population:");
	int Population= input.nextInt();
	System.out.println("Enter Rate:");
	int Rate= input.nextInt();
	
	int Year1 = Population * Rate;
	int NewPopulation1 = Year1 + Population;
	System.out.printf("The current population after one year is %d", NewPopulation1);
	int NewPopulation2 = NewPopulation1 + Population;
	System.out.printf("The current population after two years is %d", NewPopulation2);
  
	int NewPopulation3 = NewPopulation2 + NewPopulation1;
	System.out.printf("The current population after one year %d", NewPopulation3);
  
int NewPopulation4 = NewPopulation3 + NewPopulation2;
	System.out.printf("The current population after three years %d", NewPopulation4);
int NewPopulation5 = NewPopulation4 + NewPopulation3;
	System.out.printf("The current population after five years %d", NewPopulation5);

}
}  
  

