/*Question23.Enter score
	if score is greater than equals 90 print A
	if else score is greater than equals 80 less than equals 89 print B
	if else score is greater than equals 70 less than equals 79 print c
	if else score is greater than equals 60 less than equals 69 print B
	else, print F.

*/
import java.util.Scanner;
public class ExamScores{
public static void main(String [] agrs){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Scores:  ");
	int score = input.nextInt();


	if(score>=90){
		System.out.println("A");
		}
	else if (score>=80 && score<=89){
		System.out.println("B");
		}
	else if (score>=70 && score<=79){
		System.out.println("C");
		}
	else if (score>=60 && score<=69){
		System.out.println("D");
		}
	else{
		System.out.println("F");
   		}	
}
}
