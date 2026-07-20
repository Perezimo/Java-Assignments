
/*Calculating the average of three scores.
Prompt, enter the first score
Prompt, enter the second score
Prompt, enter the third score
get total score, add all the scores entered
get average of scores by dividing the total scores by 3
Get average score.
If average scores is >=90 and <=100
print A and average

If average scores is >=80 and <90
print B and average score

If average scores is >=70 and <80
print C and average  score

If average scores is >=60 and <70
print D and average score

If average scores is >0 and <59
print A and average
*/


import java.util.Scanner;
public class Total_Average_Scores{
	public static void main(String [ ] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the first score:");
	int First_Score = input.nextInt();
	
	System.out.print("Enter the second score:");
	int Second_Score = input.nextInt();
	
	System.out.print("Enter the third score: ");
	int Third_Score = input.nextInt();

	double Total_Scores = (double)(First_Score + Second_Score + Third_Score);
	double Average_Scores =(Total_Scores/3);


	System.out.println("The average scores is:" +  Average_Scores); 
	

	if(Average_Scores>=90 && Average_Scores>=100){

	       System.out.printf("A: %.2f:",  Average_Scores);
		}
	  if(Average_Scores>=80 && Average_Scores<90){

	       System.out.printf("B    %.2f:",  Average_Scores);
	}
	
	if(Average_Scores>=70 && Average_Scores<80){
		
		System.out.printf("C:   %.2f:",  Average_Scores);

	}
	if(Average_Scores>=60 && Average_Scores<70){

		       System.out.printf("D:  %.2f:",  Average_Scores);
	}
	
	if(Average_Scores>0 && Average_Scores<60){
		
		System.out.printf("F:  %.2f",  Average_Scores);
	
	}
	}

}