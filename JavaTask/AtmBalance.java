import java.util.Scanner;
public class AtmBalance{
public static void main (String [ ] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter balance" );
	double AcountBalance = input.nextDouble();

	System.out.println("Enter withdrawal Amount");
	double Amount = input.nextDouble();
	double RemainBalance = AcountBalance - Amount;

	if (AcountBalance < Amount){
	System.out.print("Insufficient amount");
	}
	if(AcountBalance > Amount){
		System.out.print("Withrawal Successful" + " " + "Your remaining balance is" + RemainBalance);
	}
	
}
}