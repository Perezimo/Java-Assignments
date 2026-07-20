//2.33
import java.util.Scanner;
public class BodyMassIndex{
public static void main(String [ ] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter user's weight:");
	int WeightInKilo = input.nextInt();
	System.out.println("Enter user's height:");
	int HeightInMeters= input.nextInt();

	int BMI = WeightInKilo/HeightInMeters*HeightInMeters;
	
	System.out.printf("The Body Mass Index of the user is %d Kg", BMI);
}
}
