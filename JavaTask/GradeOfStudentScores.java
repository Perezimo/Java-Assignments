/* Enter the name of the first student; 
	Get student name;	
 	Enter the grade of student;
	Get student grade;
	If Student is student1, print A
	If Student is student2, print B;
	If Student is student3, print C;
	If grade is D, print D;
	total number of each grades
	print total number of each grades.
			*/
	 
import java.util.Scanner;
public class GradeOfStudentScores{
public static void main(String [] agrs){
 	Scanner input = new Scanner(System.in);
	
	
	String studentScore;
	int studentScore = 0;
	int aGrade = 0;
	int bGrade= 0;
	int cGrade = 0;
	int dGrade = 0;
	int fGrade = 0;
	System.out.println("....Name and grades of students....");
	System.out.println("  ");
	
	

	 for(int number = 1; number <= 10; number++){ 
	System.out.print("Enter the number of Students : ");
	int NoStudents = input.nextInt();
	input.nextLine();
	

	System.out.print("Enter student name:");
	String studentName = input.nextLine();

	System.out.print("Enter" + " " + studentName + " " + "Score");
	
	studentScore = input.nextLine();

	switch(studentScore){
  
	 if(studentScore>=80 && studentScore<=100){
	case "A":
	++aGrade
	 System.out.println("Remark:  Excellence");
	}
		break;
		else(studentScore>=70 && studentScore>=79){

	case "B" :
	 ++bGrade;
	System.out.println("Remark:  Very Good");
		}
		
		break;
		if(studentScore>=60 && studentScore>=69){

	case "C" :
	 ++cGrade;
	System.out.println("Remark:   Good");
	}
		break;
	else(studentScore>=40 && studentScore>=59){

	case "D": 
	++dGrade;
	System.out.println("Remark:  Fair");
	}
		break;
	if(Score<=39){

	case "F": 
	++fGrade;
	System.out.println("Remark   Fail");
	
		}break;

	default: System.out.println("Please, enter valid Score");
	 	
	}

  }	


	//System.out.println("Number of A  " +  aGrade);
	//System.out.println("Number of B  " +  bGrade);
	//System.out.println("Number of C  " +  cGrade);
	//System.out.println("Number of D  " +  dGrade);
	//System.out.println("Number of F  " +  fGrade);
	}
}	
	
	 
	
	
