import java.util.Scanner;
public class StaffSalary{
public static void main(String [ ] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the Hours worked:");
	int Hour = input.nextInt();
	System.out.println("Enter the Amount per Hour:");
	double AmountPerHour = input.nextDouble();
	double WeeklySalary = 5 * (Hour * AmountPerHour);
	System.out.print("Your Weekly Salary is:" + WeeklySalary);
}
}


