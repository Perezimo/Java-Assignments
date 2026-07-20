/*Question10. enter first name
	enter second name
	enter year of birth
	compute current age
*/

import java.util.Scanner;
public class CurrentAge{
public static void main(String [] agrs){


Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the first name:  ");
	String firstName = input.nextLine();
	
	System.out.print("Enter the Last name:  ");
	String  lastName = input.nextLine();
	
	System.out.print("Enter year of birth:  ");
	int age = input.nextInt();
	
	int currentAge = 2025 - age;

	System.out.printf("Your current Age is %d:" , currentAge);
   }
}