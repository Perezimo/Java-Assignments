import java.util.Scanner;
public class PassFail{
public static void main(String [ ] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the scores;" );
	double Score = input.nextDouble();
	
	if(Score >= 70){
	System.out.print(" You passed");
	}
	else{
	System.out.print("Try again");
	}
}
}