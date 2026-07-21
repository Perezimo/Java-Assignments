import java.util.Scanner;
public class RemainderOfNumbers{
public static void main(String [] agrs){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first integer: ");
    int firstNumb= input.nextInt();
    System.out.print("Enter the first integer: ");
    int secondNumb = input.nextInt();
    
    double remainderResult = remainDivider(firstNumb , secondNumb);
    System.out.println(remainderResult);


}

public static double remainDivider(double number1 , double number2){

            double modul = number1 % number2;

            return modul;
}
}
