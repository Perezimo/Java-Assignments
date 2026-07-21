import java.util.Scanner;
public class DiffOfNumbers{
public static void main(String [] agrs){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first integer: ");
    int firstNumb= input.nextInt();
    System.out.print("Enter the first integer: ");
    int secondNumb = input.nextInt();

    int diffResults = subNumbers (secondNumb, firstNumb);
    
    System.out.println(diffResults);


 }

public static int subNumbers (int number1, int number2){
    int diff = number2 - number1;
    
        return diff;
    
}
}
    
    
