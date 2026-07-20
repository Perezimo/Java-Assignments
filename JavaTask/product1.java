import java.util.Scanner;
public class Product1{
public static void main(String [] args){
Scanner input =new Scanner(System.in);

System.out.println("Enter the second integer; ");
int b = input.nextInt();

System.out.println("Enter the third integer: ");
int c = input.nextInt();

int a = b * c;

System.out.printf("The Product is %d:", a);
	}
}

