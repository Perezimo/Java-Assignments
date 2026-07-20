import java.util.Scanner;
	public class LargestNumCount {
	public static void main (String[] args) {

	Scanner input = new Scanner(System.in);
	
	int counter = 1;

	while(counter!=0){
	System.out.print("Enter numbers: ");
	int number = input.nextInt();
	int largest=0;

	if (number > largest) {
	 largest = number;

	System.out.print(largest);
	}

	counter++;
	}
	
	//System.out.println("The largest is: " + largest);
	System.out.println(" The numbers of times largest occurs is: " + counter );

}

}