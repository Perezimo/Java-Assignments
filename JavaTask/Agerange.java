import java.util.Scanner;
public class AgeRange {
public static void main(String [ ] args){
 	Scanner input = new Scanner(System.in);
	System.out.println("Enter Age of the person");
	
	int Age = input.nextInt();
	
	if (Age> 0 && Age<=12){
	System.out.print("The Person is a Child" + " " + Age);
	}
	if (Age >= 13 && Age<=19){
	System.out.print("The Person is a Teenager" + " " + Age);
	}
	if (Age >=20 && Age <=59){
	System.out.print("The Person is an Adult" + " " + Age);
	}
	if (Age>60){
		System.out.print("The person is a Senior" + " " + Age);
		}
}
}