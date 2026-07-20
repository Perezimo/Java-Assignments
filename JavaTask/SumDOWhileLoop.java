/*QUESTION50'*/

public class SumDOWhileLoop{
public static void main(String [] agrs){

	int counter = 1;
	int sum = 0;
	do {
		sum = sum + counter;
	     	
		++counter;
		 
	} while (counter<= 100);
	System.out.printf("%d  ", sum);		
     }
}