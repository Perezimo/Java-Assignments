
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
public class GradeOfStudents{
public static void main(String [] agrs){
 	Scanner input = new Scanner(System.in);
	
	
	String studentGrade;
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

	System.out.print("Enter" + " " + studentName + " " + "Grade:");
	
	studentGrade = input.nextLine();

	switch(studentGrade){
  
	
	case "A":
	 ++aGrade; System.out.println("Remark:  Excellence");
		break;
	case "B" :
	 ++bGrade;
	System.out.println("Remark:  Very Good");
		break;
	case "C" :
	 ++cGrade;
	System.out.println("Remark:   Good");
		break;
	case "D": 
	++dGrade;
	System.out.println("Fair");
		break;
	case "F": 
	++fGrade;
	System.out.println("Fail");
		break;

	default: System.out.println("Please, enter valid grade");
	 	
	}

  }	


	System.out.println("Number of A  " +  aGrade);
	System.out.println("Number of B  " +  bGrade);
	System.out.println("Number of C  " +  cGrade);
	System.out.println("Number of D  " +  dGrade);
	System.out.println("Number of F  " +  fGrade);
	}
}	
	
	 
	
	
