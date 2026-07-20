/*Pseudocode comparing the age of a father and son.

Enter the current age of the father
Enter the current age of the son
Father age is twice that of the son;
if age is equals one and less than equal eighty;
father age = 2 x the age of the son.
Years ago,  fathe age = father age minus son's age.

print the years ago. */



import java.util.Scanner;

public class FatherSonsAge{
public static void main(String [] agrs){

Scanner input = new Scanner(System.in);

System.out.print("Enter Father's current age: ");

int fatherAge = input.nextInt();

System.out.print("Enter Son's current age: ");

int sonAge = input.nextInt();
 int age = 1;

	if(age<=80){
	fatherAge = 2* sonAge;
	int ageAgo = fatherAge - sonAge;
		System.out.println(ageAge +"years ago the father was twice as old as his son"); 
	}

}
}



