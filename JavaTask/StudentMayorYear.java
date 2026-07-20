import java.util.Scanner;
public class StudentMayorYear{
public static void main(String [] agrs){

 	Scanner input = new Scanner(System.in);

	System.out.print("Enter a character:  ");
	String studentMajor = input.nextLine();

	System.out.print("Enter a number:  ");
	int studentYear = input.nextInt();
	
	

 switch(studentMajor){

	case "I"    : System.out.println("Information Management");	
			 break;
	
	case "C" : System.out.println("Computer Science"); break;
	
	case  "A" : System.out.println("Accounting"); break;
	
	default : System.out.println("Invalid Alpalbet selected");
	}
    }
}