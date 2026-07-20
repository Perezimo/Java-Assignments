/*Question26
Prompt user for age
if age less than thirteen, print child
if age greater than thirteen and less than eighteen, print Teenager
if age is greater than seventeen and less than sisty four, print Adult
if age is greater than sisty four print Senior.


*/
import java.util.Scanner;
public class PersonAge{
public static void main(String [] agrs){


Scanner input = new Scanner(System.in);
	System.out.print("Enter your age:  ");
	int age = input.nextInt();
	
	

	if (age<13){
		System.out.print("Child");
		}
	else if(age>13 && age<17){
		System.out.println("Teaanager");
	  }
	else if(age>18 && age<64){
	        System.out.println("Adult");
		}
	else if(age>65){
	        System.out.println("Senior");
		}

		


 }
}
	
