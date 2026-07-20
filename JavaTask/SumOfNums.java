import java.util.Scanner;
public class SumOfNums{
public static void main (String [ ] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the first integer:");
	int num1 = input.nextInt();
	System.out.println("Enter the Second integer:");
	int num2 = input.nextInt();
	System.out.println("Enter the third integer:");
	int num3 = input.nextInt();
	int sum = num1 + num2 + num3;
	System.out.printf("The sum is %d%n", sum);
	int AveOfNum = sum/3;
	System.out.printf("The Average of the numbers %d%n", AveOfNum);
	
	if(num1 < num2 && num1 < num3){
	System.out.printf("Num1 is the smallest %d%n", num1);
	} 
}
}