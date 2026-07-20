public class NumberOfSecond{

	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter value of seconds: ");

	int seconds = input.nextInt();
	int minutes = seconds / 60;
	int remainder = seconds %;
	System.out.println("the number of in: " + seconds " is " + minutes + remainder "seconds");
  } 
}
	
