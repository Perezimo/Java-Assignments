import java.util.Scanner;

public class SmallestNumber{
public static void main(String [] agrs){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first integer: ");
    int firstNumb= input.nextInt();
    System.out.print("Enter the first integer: ");
    int secondNumb = input.nextInt();

    int smallNum = smallestNumber(firstNumb, secondNumb);
    System.out.println("The smallest number is: " + smallNum);
    


}


public static int smallestNumber(int number1 , int number2){

       if(number1< number2){
            return number1;
    }   

    else{
            return number2;
            }
}
}
