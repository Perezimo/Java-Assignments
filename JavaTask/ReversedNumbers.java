
public class ReversedNumbers{
public static void main(String [] args){

int number = 1234;
int reversed = 0;

while(number != 0) {

	int digit = number % 10;

		reversed = reversed * 10 + digit;

   number/= 10;
}
System.out.print(reversed);

	
}
}
