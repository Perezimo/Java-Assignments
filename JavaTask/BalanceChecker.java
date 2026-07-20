/*Question20.
	Initialize balance to 5000
	initialize deposit to 1200
	initialize withdraws to 750.25
	initialize interest rate to 1.5
	print final balance
*/


public class BalanceChecker{
public static void main(String [] agrs){

	double  balance = 5000.00;
	double deposit = 1200.50;
	double withdraws = 750.25;
	double interest = 1.5;
	double finalBalance = (balance + deposit -withdraws)*interest;

	System.out.printf("The final balance is:%.2f" , finalBalance);

    }
}