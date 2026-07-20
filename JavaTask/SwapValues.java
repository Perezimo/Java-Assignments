/*Question16. initialize a first number 
		intiliaze the second number
		create a temporary variable
		assign first number to temporary variable
		assign value of second variable to first variabl
		assign temporary variable to second variable
		print first variable 
		print second variable
*/

public class SwapValues{
public static void main(String [] args){

	int m = 5;
	int n = 6;
	int temp = 0;

	System.out.println("The value of m before swap is;" + m );
	System.out.println("The value of n before swap is:" + n);

	temp = m;
	 m = n;
	 n = temp;
	System.out.println("The value of m after is;" + m );
	System.out.println("The value for n after is:" + n);

}
}