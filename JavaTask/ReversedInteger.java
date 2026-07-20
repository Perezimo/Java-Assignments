public class ReversedInteger{

public static void main (String [] args){

	Scanner input = new Scanner(System.in);	
	System.out.print("Enter a  number to be reversed:  ");	

	int number = input.nextInt();
	int count;
	 
	int reverse = " ";

	for(count = number.length() - 1; count>=0; count--){

	reverse+=number.cahAt(count);
	}
		System.out.print(reverse);
	}
}  