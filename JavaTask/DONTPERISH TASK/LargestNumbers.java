
import java.util.Scanner;

public class LargestNumbers{
public static void main(String [] agrs){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first integer: ");
    int firstNumb= input.nextInt();
    System.out.print("Enter the first integer: ");
    int secondNumb = input.nextInt();

    int larNum = largestNumber(firstNumb, secondNumb);
    System.out.println("The largest number is: " + larNum);
    


}


public static int largestNumber(int number1 , int number2){

       if(number1> number2){
            return number1;
    }   

    else{
            return number2;
            }
}
}
