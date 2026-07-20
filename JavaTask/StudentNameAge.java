import java.util.Scanner;
public class StudentNameAge{
public static void main(String [] agrs){


Scanner input = new Scanner(System.in);
	
	System.out.print("Enter your name:  ");
	String name = input.nextLine();

	
	System.out.print("Enter your age:  ");
	int age = input.nextInt();
	
	System.out.println("Hello " + name + " " + "You are" + " " + age + " " + "years old.");

	}

}